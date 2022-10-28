// Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time by comparisons.
/*
To sort an array of size N in ascending order:
1. Iterate from arr[1] to arr[N] over the array.
2. Compare the current element (key) to its predecessor.
3. If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.
*/

#include <iostream>
using namespace std;

// A utility function to print an array of size n
void display(int *arr, int size)
{
   for (int i = 0; i < size; i++)
      cout << arr[i] << " ";
   cout << endl;
}

// Function to sort an array using insertion sort
void insertionSort(int *arr, int size)
{
   int key, j;
   for (int i = 1; i < size; i++)
   {
      key = arr[i];
      j = i;
      while (j > 0 && arr[j - 1] > key)
      {
         arr[j] = arr[j - 1];
         j--;
      }
      arr[j] = key;
   }
}

// Driver code
int main()
{
   int n;
   cout << "ENTER NUMBER OF ELEMENTS: ";
   cin >> n;
   int arr[n];
   cout << "ENTER ELEMENTS" << endl;
   for (int i = 0; i < n; i++)
   {
      cin >> arr[i];
   }
   cout << "ARRAY BEFORE SORTING IS: ";
   display(arr, n);
   insertionSort(arr, n);
   cout << "ARRAY AFTER SORTING IS:";
   display(arr, n);
}
