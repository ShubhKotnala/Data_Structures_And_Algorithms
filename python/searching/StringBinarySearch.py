'''Binary search works in divide and conquer strategy.
For this algorithm we will require a sorted array line 54 in this case since we are dealing with strings we will sort array alphabetically.
so here we divide array in two parts then we analise the mid element and decide the probablity of finding the element on the right or the left of the array line 13 - line 20
once the side(left or right/ before or after) is decided we repete the partition step and again perform condition check for right or left until the element is found line 23'''


# function to decide the flow of search
def conditioncheck(str1, str2):

    # strings can also be used as array so consider it as an array of alphabets.
    alph = "abcdefghijklmnopqurstuvwxyz"

    # decision factors
    # conditions will decide the probablity of finding the element on the right or the left of the mid index element
    if alph.index(str1[0]) > alph.index(str2[0]):
        return 1
    elif alph.index(str1[0]) < alph.index(str2[0]):
        return 0
    else:
        return -1

# Main Search Algorithm
def binarySearch(arr, l, r, x):

    if r >= l:

        # Binary search works on divide and conquer strategy so we divide array in two 
        # mid is the middle element of the unsearched array
        mid = l + (r - l) // 2

        # searching Algorithm
        if conditioncheck(arr[mid], x) == -1:
            return mid
        elif conditioncheck(arr[mid], x) == 1:
            binarySearch(arr, l, mid-1, x)
        else:
            binarySearch(arr, mid+1, r, x)


# Driver Code

list = []


# Input List From User
print("Element : done ---> to Exit")
while (1):
    Element = input("Element : ")
    if Element == "done" or Element == "Done" : break
    list.append(Element)

# First we sort array alphabetically and then apply the search algorithm
# sorted function sorts the array alphabetically
sorted_list = sorted(list)

# input Element to be searched
x = input("find : ")

# Function Call
indx = binarySearch(sorted_list, 0, len(sorted_list)-1, x)
print("sorted list : ", sorted_list)

# Print Result
if (indx != None):
    print ("Found at index ", indx)
else :
    print ("Element Not found \"_\"")
