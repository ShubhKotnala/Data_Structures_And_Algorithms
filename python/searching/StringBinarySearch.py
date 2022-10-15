# function to decide the flow of search
def conditioncheck(str1, str2):

    # strings can also be used as array so consider it as an array of alphabets.
    alph = "abcdefghijklmnopqurstuvwxyz"

    # decision factors
    if alph.index(str1[0]) > alph.index(str2[0]):
        return 1
    elif alph.index(str1[0]) < alph.index(str2[0]):
        return 0
    else:
        return -1

def binarySearch(arr, l, r, x):

    # initial Condition
    if r >= l:

        # mid element is the middle of the unsearched array
        mid = l + (r - l) // 2

        # searching Algorithm
        if conditioncheck(arr[mid], x) == -1:
            return mid
        elif conditioncheck(arr[mid], x) == 1:
            binarySearch(arr, l, mid-1, x)
        else:
            binarySearch(arr, mid+1, r, x)

list = []

print("Element : done ---> to Exit")

# Input List From User
while (1):
    temp = []
    Element = input("Element : ")
    if Element == "done" or Element == "Done" : break
    list.append(Element)

# soritng Alphabetically
sorted_list = sorted(list)

x = input("find : ")

# Function Call
indx = binarySearch(sorted_list, 0, len(sorted_list)-1, x)
print("sorted list : ", sorted_list)

# Print Result
if (indx != None):
    print ("Found at index ", indx)
else :
    print ("Element Not found \"_\"")
