def sentinal_search(list1,n,key):
    last=list1[n-1]
    list1[n-1] =key
    i=0
    while(list1[i]!=key):
        i+=1
    list1[n-1]=last
    if((i<n-1) or (list1[n-1]==key)):
        return i
    else:
        return -1 
list1=[]
n=int(input("enter the no of elements in list:"))
for i in range(0,n):
    a=int(input("enter the elements"))
    list1.append(a)
    list1.sort()
print(list1)
key=int(input("enter the key:"))
res=sentinal_search(list1,n,key)
if(res==-1):
    print("element not found")
else:
    print("element found at index:",res)           

