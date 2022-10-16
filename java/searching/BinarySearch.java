/*
Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval
in half. The idea of binary search is to use the information that the array is sorted
and reduce the time complexity to O(Log n).

Test Cases:
    Input: Array[10,20,30,40,50] key = 20
    Output: Found 20

    Input: Array[10,20,30,40,50] key = 24
    Output: Not found 24

    Input: Array[14,28,42,56,70,84,98,112,126,140] key = 70
    Output: Found 70

*/
public class BinarySearch{

    static int binarySearch(int[] arr1, int key){
    int start = 0;
    int end = arr1.length - 1;

    while (start <= end) 
    {
        int middle = (int)Math.floor((start + end) / 2);
        // System.out.println("middle: "+middle);

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

