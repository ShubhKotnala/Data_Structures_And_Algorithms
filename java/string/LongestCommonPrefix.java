class LongestCommonPrefix {
    public static void main(String[] args) {
        // Check if there are any strings passed as arguments
        System.out.print("The common prefix is:");
        if (args.length == 0) {
            System.out.println("");
            return;
        }
        if (args.length == 1) {
            System.out.println(args[0]);
            return;
        }

        String prev = args[0];

        for (int i = 1; i < args.length; i++) {
            prev = getCommonPrefix(prev, args[i]);
            // If at any point the common prefix is empty, break early.
            if (prev.isEmpty()) {
                System.out.println("");
                return;
            }
        }

        // Output the longest common prefix
        System.out.println(prev);
    }

    private static String getCommonPrefix(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                sb.append(a.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
