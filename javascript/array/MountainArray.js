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

function validMountainArray(arr) {
    if (arr.length < 3) return false;
    if (arr[1] < arr[0]) return false;

    let maxFound = false;

     for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i + 1] === arr[i]) return false;
        if (maxFound && arr[i + 1] > arr[i]) return false;
        if (arr[i] > arr[i + 1]) {
            maxFound = true;
        }
    }
  // return maxFound ? true : false
  return maxFound;
}

arr = [1,2,3,4,5,4,3,2,1]
console.log(validMountainArray(arr))
