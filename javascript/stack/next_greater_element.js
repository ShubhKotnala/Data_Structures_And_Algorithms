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

function nextGreaterElements(nums) {
  const n = nums.length;
  const res = new Array(n).fill(-1);
  const st = []; // stack of indices

  for (let i = 0; i < n; i++) {
    while (st.length && nums[i] > nums[st[st.length - 1]]) {
      const idx = st.pop();
      res[idx] = nums[i];
    }
    st.push(i);
  }

  return res;
}

const nums = [2, 1, 2, 4, 3];
console.log("Input :", nums);
console.log("Output:", nextGreaterElements(nums));
console.log("Test1 :", nextGreaterElements([1, 3, 2, 4])); // [3,4,4,-1]
console.log("Test2 :", nextGreaterElements([6, 5, 4, 3])); // [-1,-1,-1,-1]
console.log("Test3 :", nextGreaterElements([1, 1, 1, 1])); // [-1,-1,-1,-1]

