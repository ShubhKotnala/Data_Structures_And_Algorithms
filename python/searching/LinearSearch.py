def linear_search(list1,n,key):
    for i in range(0,n):
        if(list1[i]==key):
            return i
    return -1
list1=[]
n=int(input("enter the no of elements in list:"))
for i in range(0,n):
    a=int(input("enter the elements"))
    list1.append(a)
    list1.sort()
print(list1)
key=int(input("enter the key:"))
res=linear_search(list1,n,key)
if(res==-1):
    print("element not found")
else:
    print("element found at index:",res)           

