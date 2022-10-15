public class BinarySearch{

    static int binarySearch(int[] arr1, int key){
    int start = 0;
    int end = arr1.length - 1;

    while (start <= end) 
    {
        int middle = (int)Math.floor((start + end) / 2);
        System.out.println("middle: "+middle);

        if (arr1[middle] == key) {
            // found the key
            return middle;
        } else if (arr1[middle] < key) {
            // continue searching to the right
            start = middle + 1;
        } else {
            // search searching to the left
            end = middle - 1;
        }
    }
	// key wasn't found
    return -1;
    }

    public static void main(String args[])
    {
        int[] arr1 = {10,20,30,40,50};
        int key = 20;
        int data = binarySearch(arr1, key);
        if(data==-1)
        {
            System.out.println("Not found "+ key);
        }
        else{
            System.out.println("Found "+ key);
        }
    }
}

