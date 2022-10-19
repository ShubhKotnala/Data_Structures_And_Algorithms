/*

Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]

*/
import java.util.Arrays;

class DuplicateZeroes {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length, i = 0;
        for(; i< n ;i++){
            int val = arr[i];
            if(val == 0){
                for(int j = n-1; j>i;j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }

    public static void main(String[] args){
        int[] input =  new int[]{1,0,2,3,0,4,5,0};
        duplicateZeros(input);
        System.out.println("After removing duplicate zeroes in [1, 0, 2, 3, 0, 4, 5, 0], output is " + Arrays.toString(input));
        input =  new int[]{1,2,3};
        duplicateZeros(input);
        System.out.println("After removing duplicate zeroes in [1, 2, 3], output is " + Arrays.toString(input));
        input =  new int[]{1,0,2,1,0,1,3,4,5};
        duplicateZeros(input);
        System.out.println("After removing duplicate zeroes in [1, 0, 2, 1, 0, 1, 3, 4, 5], output is " + Arrays.toString(input));
    }

}
