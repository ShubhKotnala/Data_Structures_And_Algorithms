/*

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

*/

class ThirdMaximumNumber {

    public static int thirdMax(long[] nums) {
       long max1 = Long.MIN_VALUE, max2 =Long.MIN_VALUE, max3 = Long.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i] > max2 && nums[i] < max1){
                max3 = max2;
                max2 = nums[i];
            }else if(nums[i] > max3 && nums[i] < max2){
                max3 = nums[i];
            }
        }
        if (max3 == Long.MIN_VALUE) {
            max3 = max1;
        }

        return (int)max3;
    }

    public static void main(String[] args){
        long[] input =  new long[]{3,2,1,4,5,9,0};
        System.out.println("ThridMaxNumber in [3,2,1,4,5,9,0] is " + thirdMax(input));
        input =  new long[]{3,2};
        System.out.println("ThridMaxNumber in [3,2] is " + thirdMax(input));
        input =  new long[]{2,2,3,1};
        System.out.println("ThridMaxNumber in [2,2,3,1] is " + thirdMax(input));
    }
}
