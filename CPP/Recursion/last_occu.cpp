#include<bits/stdc++.h>
using namespace std;
int lastidx(int arr[],int n,int key)
{
    if(n==0)
    {
        return -1;
    }
    //recursion 
    int subidx=lastidx(arr+1,n-1,key);
    if(subidx==-1)
    {
        if(arr[0]==key)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    else
    {
        return subidx+1;
    }

}
int main()
{
    int arr[]={1,2,3,4,5,6,7,4};
    int n=sizeof(arr)/sizeof(int); 
    int key;
    cin>>key;
    cout<<lastidx(arr,n,key);
}