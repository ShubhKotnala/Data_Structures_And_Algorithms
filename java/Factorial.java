import java.util.Scanner;

public class Factorial {
        
    public static void main(String []args){
        int num,j,n=1,size=1;
        int arr[] = new int[50];
        arr[0] = 1;
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        num = sc.nextInt();
       
        while(n <= num){
          size = obj.factorial(size,n,arr);  
          n++;
        }
        
        System.out.println("Factorial : ");
        for(j=size-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
        System.out.println();
    }  
    
    int factorial(int size,int n,int arr[])
    {
        int f, rem=0;
        for (int i=0;i<size;i++) 
        { 
            f = n * arr[i] + rem;
            arr[i] = f % 10;
            rem = f / 10;
        }
            
        for(int k=0;k<rem;k++)
        {
            arr[size] = rem % 10;
            rem = rem / 10;  
            size++;
        }
        return size;
    }
} 