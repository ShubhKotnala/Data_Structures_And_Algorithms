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
function singleNumber(nums) {
  let len = nums.length;
  let result = 0;
  for (let i = 0; i < len; i++) {
    result = result ^ nums[i];
  }
  console.log(result);
}

singleNumber([1, 1, 2, 2, 3, 4, 5, 4, 5]);
