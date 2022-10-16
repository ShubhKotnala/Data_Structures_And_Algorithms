/*
Linear Search is defined as a sequential search algorithm that starts at one end and
goes through each element of a list until the desired element is found,
otherwise the search continues till the end of the data set.

Test Cases:
    Input: Array[10,8,12,98,67] key = 12
    Output: Found 12

    Input: Array[10,8,12,98,67] key = 24
    Output: Not found 24

    Input: Array[24,25,78,94,98,12,10,67,92,95] key = 94
    Output: Found 94

*/
public class LinearSearch{

    static int linearSearch(int[] arr1, int key)
    {
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==key)
            {
                return arr1[i];
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int[] arr1 = {10,8,12,98,67};
        int key = 12;
        int data = linearSearch(arr1, key);
        if(data==-1)
        {
            System.out.println("Not found "+ key);
        }
        else{
            System.out.println("Found "+ key);
        }
    }
}

