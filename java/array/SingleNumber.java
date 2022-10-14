/*
 Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 You must implement a solution with a linear runtime complexity and use only constant extra space.
 
 Example 1:
    Input: nums = [2,2,1]
    Output: 1

Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4
 */
class SingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,4,3,5,4,5};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            res = res ^ nums[i];
        }   
        return res;
    }
}