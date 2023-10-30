/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 
This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

Input: arr[] = {6, 3, 0, 5}
Output: arr[] = {0, 3, 5, 6}
*/

#include<iostream>
#include <vector>
using namespace std;

vector<int> bubbleSort(vector<int> arr, int n){
    for(int i = 0; i < n ; i++)
    {
        for(int j = 0; j < n-1; j++)
        {
            if(arr[j] > arr[j+1])
            {
                swap(arr[j],arr[j+1]);
            }
        }
    }
    return arr;
}
int main(){
    vector<int> arr = {2,4,5,1,0,-9};
    int n = arr.size();
    vector<int> sortedArray = bubbleSort(arr,n);
    for(int i=0;i<n;i++){
        cout<<sortedArray[i]<<" ";
    }
    return 0;
}
