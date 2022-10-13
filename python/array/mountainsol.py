
#Mountain array solution in python


class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        i=0;n=len(arr);j=n-1;
        while i+1<n and arr[i]<arr[i+1] : i+=1
        while j>0 and arr[j-1]>arr[j] : j-=1
        if i>0 and i==j and j<n-1 :
            return True
        return False