"""
Problem:
---------
Given n non-negative integers representing an elevation map where the width 
of each bar is 1, compute how much water it can trap after raining.

Example:
---------
Input:  height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

Explanation:
-------------
Visual representation of bars (each number is bar height):

       #
   #   ## # 
 # ## ######
-------------
 0 1 0 2 1 0 1 3 2 1 2 1

The water trapped between bars:
Index 2: 1 unit
Index 4: 1 unit
Index 5: 2 units
Index 6: 1 unit
Index 9: 1 unit
Total = 6 units
"""

def trap(height):
    n = len(height)
    if n < 3:
        # Fewer than 3 bars means no space to trap water
        return 0

    # Two pointers at both ends
    left, right = 0, n - 1

    # Track maximum height to the left and right
    left_max, right_max = 0, 0

    # Variable to accumulate total trapped water
    water = 0

    # Move the pointers towards each other
    while left < right:
        # The smaller bar determines the trapping boundary
        if height[left] < height[right]:
            # Update left_max if current bar is higher
            if height[left] >= left_max:
                left_max = height[left]
            else:
                # Water trapped = left_max - current height
                water += left_max - height[left]
            left += 1
        else:
            # Similarly for the right side
            if height[right] >= right_max:
                right_max = height[right]
            else:
                water += right_max - height[right]
            right -= 1

    return water


# Example Run
if __name__ == "__main__":
    example = [0,1,0,2,1,0,1,3,2,1,2,1]
    print("Elevation Map:", example)
    print("Total Water Trapped:", trap(example))  # Output: 6
