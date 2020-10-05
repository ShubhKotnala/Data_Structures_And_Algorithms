import java.util.Scanner;
public class Bubble {

     public static void main(String []args){
        int len;
        Bubble obj = new Bubble();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        len = sc.nextInt();
        
        int []arr = new int[len];
        
        System.out.println("Enter array");
        for(int k=0;k<len;k++)
        {
            arr[k] = sc.nextInt();
        }
        
        obj.sort(arr, len);
        
    }
    
    void sort(int []arr, int len)
    {
        int i,j,swap,temp;
        for(i=0;i<len;i++)
        {
            swap = 0;
            for(j=0;j<len-i-1;j++)
            {
               if(arr[j]>arr[j+1])
               {                  
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swap =1;
               }                     
            }
            
            if(swap == 0) 
            {
                break;
            }
        }
        System.out.println("Sorted Array is:");
        for(int k=0;k<len;k++)
        {
            System.out.println(arr[k]);
        }
        
    }
    
}

