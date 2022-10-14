'''
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 

Example 1:
    Input: n = 3
    Output: ["1","2","Fizz"]

Example 2:
    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]

Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 

Constraints:
    1 <= n <= 104
'''

def fizz_buzz(n):
    
    str1 = ""
    array = []
    # print(type(int(num)))
    num = int(num)
    i = 1
    for i in range(1,num+1):
        if i % 3 == 0 and i % 5 == 0:
            str1 = 'FizzBuzz'
            array.append(str1)
            continue
        elif i % 3 == 0:
            str1 = 'Fizz'
            array.append(str1)
            continue
        elif i % 5 == 0:
            str1 = 'Buzz'
            array.append(str1)
            continue
        array.append(i)

    return array



if __name__ == "__main__":
    num = input("Enter a number: ")
    print(fizz_buzz(num))