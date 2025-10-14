import java.util.*;

public class PathfindingVisualizer {
    private static final int[][] GRID = new int[10][10];
    private static final int OBSTACLE = 1, PATH = 2, VISITED = 3;
    private static int steps = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        initializeGrid(random);
        
        System.out.println("🧭 Advanced Pathfinder");
        System.out.println("1. A* Search Algorithm");
        System.out.println("2. Dijkstra's Algorithm");
        System.out.println("3. Greedy Best-First Search");
        System.out.print("Choose algorithm (1-3): ");
        
        int choice = scanner.nextInt();
        int[] start = {0, 0}, end = {9, 9};
        
        visualizePathfinding(start, end, choice);
        analyzePerformance(choice);
    }
    
    private static void initializeGrid(Random random) {
        for (int i = 0; i < GRID.length; i++) {
            for (int j = 0; j < GRID[i].length; j++) {
                GRID[i][j] = random.nextDouble() < 0.2 ? OBSTACLE : 0;
            }
        }
        GRID[0][0] = 0; GRID[9][9] = 0; // Ensure start/end are clear
    }
    
    private static void visualizePathfinding(int[] start, int[] end, int algorithm) {
        System.out.println("\n🟦 = Empty | 🟥 = Obstacle | 🟩 = Path | 🟨 = Visited\n");
        
        switch(algorithm) {
            case 1: aStarSearch(start, end); break;
            case 2: dijkstraSearch(start, end); break;
            case 3: greedyBestFirst(start, end); break;
        }
        
        displayGrid();
        System.out.println("Total steps: " + steps);
    }
    
    private static void aStarSearch(int[] start, int[] end) {
        PriorityQueue<Node> open = new PriorityQueue<>();
        Set<String> closed = new HashSet<>();
        
        open.add(new Node(start[0], start[1], 0, heuristic(start, end)));
        
        while (!open.isEmpty()) {
            Node current = open.poll();
            steps++;
            
            if (current.x == end[0] && current.y == end[1]) {
                reconstructPath(current);
                return;
            }
            
            closed.add(current.x + "," + current.y);
            GRID[current.x][current.y] = VISITED;
            
            for (int[] neighbor : getNeighbors(current.x, current.y)) {
                if (closed.contains(neighbor[0] + "," + neighbor[1])) continue;
                
                int newCost = current.gCost + 1;
                Node neighborNode = findNode(open, neighbor[0], neighbor[1]);
                
                if (neighborNode == null || newCost < neighborNode.gCost) {
                    if (neighborNode != null) open.remove(neighborNode);
                    open.add(new Node(neighbor[0], neighbor[1], newCost, 
                                    newCost + heuristic(neighbor, end), current));
                }
            }
            
            if (steps % 20 == 0) displayGrid();
        }
    }
    
    private static void dijkstraSearch(int[] start, int[] end) {
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.gCost));
        Map<String, Integer> distances = new HashMap<>();
        
        queue.add(new Node(start[0], start[1], 0, 0));
        distances.put(start[0] + "," + start[1], 0);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            steps++;
            
            if (current.x == end[0] && current.y == end[1]) {
                reconstructPath(current);
                return;
            }
            
            GRID[current.x][current.y] = VISITED;
            
            for (int[] neighbor : getNeighbors(current.x, current.y)) {
                int newDist = current.gCost + 1;
                String key = neighbor[0] + "," + neighbor[1];
                
                if (!distances.containsKey(key) || newDist < distances.get(key)) {
                    distances.put(key, newDist);
                    queue.add(new Node(neighbor[0], neighbor[1], newDist, newDist, current));
                }
            }
        }
    }
    
    private static void greedyBestFirst(int[] start, int[] end) {
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.hCost));
        queue.add(new Node(start[0], start[1], 0, heuristic(start, end)));
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            steps++;
            
            if (current.x == end[0] && current.y == end[1]) {
                reconstructPath(current);
                return;
            }
            
            GRID[current.x][current.y] = VISITED;
            
            for (int[] neighbor : getNeighbors(current.x, current.y)) {
                queue.add(new Node(neighbor[0], neighbor[1], 0, heuristic(neighbor, end), current));
            }
            
            if (steps % 15 == 0) displayGrid();
        }
    }
    
    private static List<int[]> getNeighbors(int x, int y) {
        List<int[]> neighbors = new ArrayList<>();
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        for (int[] dir : directions) {
            int nx = x + dir[0], ny = y + dir[1];
            if (nx >= 0 && nx < 10 && ny >= 0 && ny < 10 && GRID[nx][ny] != OBSTACLE) {
                neighbors.add(new int[]{nx, ny});
            }
        }
        return neighbors;
    }
    
    private static int heuristic(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]); // Manhattan distance
    }
    
    private static Node findNode(PriorityQueue<Node> queue, int x, int y) {
        return queue.stream()
                   .filter(n -> n.x == x && n.y == y)
                   .findFirst()
                   .orElse(null);
    }
    
    private static void reconstructPath(Node endNode) {
        Node current = endNode;
        while (current != null) {
            GRID[current.x][current.y] = PATH;
            current = current.parent;
        }
    }
    
    private static void displayGrid() {
        System.out.print("\033[H\033[2J");
        for (int i = 0; i < GRID.length; i++) {
            for (int j = 0; j < GRID[i].length; j++) {
                char c = switch(GRID[i][j]) {
                    case OBSTACLE -> '🟥';
                    case PATH -> '🟩';
                    case VISITED -> '🟨';
                    default -> '🟦';
                };
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private static void analyzePerformance(int algorithm) {
        String[] names = {"A*", "Dijkstra", "Greedy Best-First"};
        System.out.println("Algorithm: " + names[algorithm-1]);
        System.out.println("Efficiency: " + (steps < 50 ? "Excellent" : steps < 100 ? "Good" : "Moderate"));
    }
    
    static class Node implements Comparable<Node> {
        int x, y, gCost, hCost, fCost;
        Node parent;
        
        Node(int x, int y, int gCost, int hCost) {
            this(x, y, gCost, hCost, null);
        }
        
        Node(int x, int y, int gCost, int hCost, Node parent) {
            this.x = x; this.y = y;
            this.gCost = gCost; this.hCost = hCost;
            this.fCost = gCost + hCost;
            this.parent = parent;
        }
        
        public int compareTo(Node other) {
            return Integer.compare(this.fCost, other.fCost);
        }
    }
}
