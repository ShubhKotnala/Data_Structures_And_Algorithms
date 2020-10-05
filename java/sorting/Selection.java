import java.util.Scanner;
public class Selection {

     public static void main(String []args){
        int len;
        Selection obj = new Selection();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        len = sc.nextInt();
        
        int []arr = new int[len];
        
        System.out.println("Enter array");
        for(int k=0;k<len;k++)
        {
            arr[k] = sc.nextInt();
        }
        
        obj.sort(arr);
        
    }
    
    void sort(int []arr)
    {
        int temp,i,j,swap=0;
        for(i=0;i<arr.length;i++)
        {
            temp = i;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[temp])
                {
                    temp = j;
                }
            }
            swap = arr[i];
            arr[i] = arr[temp];
            arr[temp] = swap;
        }
        
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
        
    }
    
}
