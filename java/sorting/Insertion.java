import java.util.Scanner;
public class Insertion {

    public static void main(String []args){
        int len;
        Insertion obj = new Insertion();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        len = sc.nextInt();
        
        int []arr = new int[len];
        
        System.out.println("Enter array");
        for(int k=0;k<len;k++)
        {
            arr[k] = sc.nextInt();
        }
        
        obj.sort(arr,len);       
    }
    
    void sort(int []ar,int len)
    {
        int i,j,temp,swap;
        for(i=1;i<len;i++)
        {
            temp = ar[i];
            for(j=i-1;j>=0;j--)
            {
                if(temp < ar[j])
                {
                    swap = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = swap;                   
                }              
            }
        }
        
        for(int k=0;k<len;k++)
        {
            System.out.println(ar[k]);
        }
        
    }
    
}

