'''
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

Example 1:
    Input: num = "1432219", k = 3
    Output: "1219"
    Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

Example 2:
    Input: num = "10200", k = 1
    Output: "200"
    Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.

Example 3:
    Input: num = "10", k = 2
    Output: "0"
    Explanation: Remove all the digits from the number and it is left with nothing which is 0.
    

Constraints:
    1 <= k <= num.length <= 105
    num consists of only digits.
    num does not have any leading zeros except for the zero itself.
'''

def remove_k_digits(num="", k=0): 
    if k >= len(num):
        return "0"

    if k is 0:
        return num

    stack = []

    for c in num: 
        while stack and k > 0 and stack[-1] > c:
            stack.pop()
            k-=1  
        if stack or c != '0':
            stack.append(c)

    #If after all iteration, k is greater than 0
    while stack and k > 0: 
        k-=1
        stack.pop();
    
    if not stack: 
        return "0" 

    result = ""
    stack.reverse()
    while stack: 
        result += stack.pop()
    
    return result;


if __name__ == ("__main__"):
    print(remove_k_digits("1432219", 3))
    print(remove_k_digits("10200", 1))
    print(remove_k_digits("10", 2))
    print(remove_k_digits("432342", 2))
