def binary_search(list1,key):
    low=0
    high=len(list1)-1
    while low<=high:
        mid=(low+high)//2
        if key==list1[mid]:
           return mid
        elif key>list1[mid]:
           low=mid+1
        else:
           high=mid-1    
    return 0
list1=[]
n=int(input("enter the no of elements in list:"))
for i in range(0,n):
    a=int(input("enter the elements"))
    list1.append(a)
    list1.sort()
print(list1)
key=int(input("enter the key:"))
res=binary_search(list1,key)
if(res==-1):
    print("element not found")
else:
    print("element found at index:",res)           

