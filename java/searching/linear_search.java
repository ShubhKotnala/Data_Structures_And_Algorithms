public class linear_search{

    static int linearSearch(int[] arr1, int key){
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
        int arr1[] = {10,8,12,98,67};
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

