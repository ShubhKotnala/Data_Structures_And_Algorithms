#include<bits/stdc++.h>
using namespace std;
int merge(int a[],int b[],int mer[],int m,int n)
{ 
    int i=0,j=0,k=0;
    while(i<m)
    {
        mer[k]=a[i];
        mer++;
        i+=1;
    }
    while(j<n)
    {
        mer[k]=b[j];
        k++;
        j+=1;
    }
    sort(mer,mer+n+m);
}
int main()
{
    int a[]={1,3,5,7,9};
    int b[]={2,4,6,8,10};
    int m=sizeof(a)/sizeof(int);
    int n=sizeof(b)/sizeof(int);
    int mer[m+n];
    int i;
    
    merge(a,b,mer,m,n);
    cout<<"The Sorted array is: ";
    for(i=0;i<m+n;i++)
    {
        cout<<" "<<mer[i];
    }
    return 0;
}
