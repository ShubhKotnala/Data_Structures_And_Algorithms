/*
Title: Next Greater Element (Monotonic Stack)

Problem:
Given an array of integers `nums`, for each element, find the next element
to its right that is strictly greater. If none exists, return -1 for that index.

Example:
  Input:  [2, 1, 2, 4, 3]
  Output: [4, 2, 4, -1, -1]

Time: O(n)
Space: O(n)
*/

import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> st = new ArrayDeque<>(); // stack of indices

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[i] > nums[st.peekLast()]) {
                int idx = st.removeLast();
                res[idx] = nums[i];
            }
            st.addLast(i);
        }
        return res;
    }

    // Demo
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 4, 3};
        System.out.println("Input : " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(nextGreaterElements(nums)));

        System.out.println("Test1 : " + Arrays.toString(nextGreaterElements(new int[]{1,3,2,4}))); // [3,4,4,-1]
        System.out.println("Test2 : " + Arrays.toString(nextGreaterElements(new int[]{6,5,4,3}))); // [-1,-1,-1,-1]
        System.out.println("Test3 : " + Arrays.toString(nextGreaterElements(new int[]{1,1,1,1}))); // [-1,-1,-1,-1]
    }
}
