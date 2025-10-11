"""
Title: Next Greater Element (Monotonic Stack)

Problem:
Given an array of integers `nums`, for each element, find the next element
to its right that is strictly greater. If there is no such element, return -1
for that position.

Example:
    Input:  [2, 1, 2, 4, 3]
    Output: [4, 2, 4, -1, -1]

Explanation:
- Next greater for 2 is 4
- Next greater for 1 is 2
- Next greater for 2 is 4
- Next greater for 4 is none (-1)
- Next greater for 3 is none (-1)

Approach:
Use a monotonic decreasing stack that stores indices of elements.
Iterate through the list once, maintaining the stack.
When a greater element is found, pop from the stack and assign the result.

Complexity:
    Time  : O(n)
    Space : O(n)
"""

def next_greater_elements(nums):
    n = len(nums)
    result = [-1] * n
    stack = []  # stores indices

    for i in range(n):
        # While stack is not empty and current element is greater
        while stack and nums[i] > nums[stack[-1]]:
            idx = stack.pop()
            result[idx] = nums[i]
        stack.append(i)

    return result


if __name__ == "__main__":
    # Example run
    nums = [2, 1, 2, 4, 3]
    print("Input :", nums)
    print("Output:", next_greater_elements(nums))

    # Additional tests
    print("Test 1:", next_greater_elements([1, 3, 2, 4]))  # [3,4,4,-1]
    print("Test 2:", next_greater_elements([6, 5, 4, 3]))  # [-1,-1,-1,-1]
    print("Test 3:", next_greater_elements([1, 1, 1, 1]))  # [-1,-1,-1,-1]
