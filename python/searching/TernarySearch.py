'''Ternary search is a decrease(by constant) and conquer algorithm that can be used to find an element in an array.
It is same as the binary search. The only difference is that, it reduces the time complexity a bit more.
Its time complexity is O(log n base 3) and that of binary search is O(log n base 2).'''


# recursive approach to ternary search
import math as mt

def ternarySearch(l, r, key, ar):

	if (r >= l):
		mid1 = l + (r - l) //3
		mid2 = r - (r - l) //3

		if (ar[mid1] == key):
			return mid1
		
		if (ar[mid2] == key):
			return mid2
		
		if (key < ar[mid1]):
			return ternarySearch(l, mid1 - 1, key, ar)
		
		elif (key > ar[mid2]):
			return ternarySearch(mid2 + 1, r, key, ar)
		
		else:
			return ternarySearch(mid1 + 1,
								mid2 - 1, key, ar)
		
	return -1

l, r, p = 0, 9, 5
ar = [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
l = 0
r = 9

# Key to be searched in the array
key = 5
p = ternarySearch(l, r, key, ar)
print("Index of", key, "is", p)

# Key to be searched in the array
key = 50
p = ternarySearch(l, r, key, ar)
print("Index of", key, "is", p)
