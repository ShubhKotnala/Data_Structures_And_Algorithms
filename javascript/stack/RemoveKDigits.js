/*
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
 */

function removeKDigits(num="", k) {
    if ( k >= num.length) {
        return "0";
    }

    if (k == 0) {
        return num;
    }

    stack = [];

    for(c of num) {
        while (!isEmpty(stack) && k > 0 && peek(stack) > c) {
            stack.pop();
            k--;
        }
        if (!isEmpty(stack) || c != '0') {
            stack.push(c)
        }
    }


    //If after all iteration, k is greater than 0
    while (!isEmpty(stack) && k > 0) {
        k--;
        stack.pop();
    }

    if(isEmpty(stack)){ 
        return "0";
    }

    let result = "";
    stack.reverse();
    while (!isEmpty(stack)) {
        result += stack.pop();
    }

    return result;
}

function peek(stack) {
    if (stack.length > 0)
        return stack[stack.length - 1];
    return 0;
}

function isEmpty(stack) {
    return stack.length <= 0;
}

console.log(removeKDigits("1432219", 3));
console.log(removeKDigits("10200", 1));
console.log(removeKDigits("10", 2));
console.log(removeKDigits("432342", 2));