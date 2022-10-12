/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Explanation: Following the above constrainsts, 
For an array [1,2,3,3,4,5,4,3,2,1]
    This array is increasing, but not strictly (2, '3', '3', 4) hence the array is not a valid mountain array

For an array [1,2,3,4,5,4,3,2,1]
    This array is strictly increasing, and also strictly descreasing, hence the array is a valid mountain array
 

Example 1:
    Input: arr = [2,1]
    Output: false

Example 2:
    Input: arr = [3,5,5]
    Output: false

Example 3:
    Input: arr = [0,3,2,1]
    Output: true
 
Constraints:
    1 <= arr.length <= 104
    0 <= arr[i] <= 104
 */
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,4,3,2,1};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        return false;
    }
}
