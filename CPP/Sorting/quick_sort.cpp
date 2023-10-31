/*
Quick Sort is a common sorting algorithm that sorts an array or list using a strategy of Divide and Conquer.
he basic idea behind quicksort is as follows:
Select an element from the array as the pivot.
Moves elements in the array smaller than the base to the left of the base and elements larger than the base to the right of the base. This step is called a partition operation.
Recursively sorts the subarray to the left of the base and the subarray to the right.
This process is repeated until the entire array is in order. The key of fast sorting is to select the appropriate base element and clever partitioning algorithm to ensure the efficiency of sorting

input arr[] = {10, 7, 8, 9, 1, 5}
output arr[] = {1, 5, 7, 8, 9, 10}
*/

#include<iostream>
using namespace std;

int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[i + 1], arr[high]);
    return (i + 1);
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    quickSort(arr, 0, n - 1);

    cout << "After sorting: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl;
    return 0;
}

