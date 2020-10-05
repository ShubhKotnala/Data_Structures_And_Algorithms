import java.util.Scanner;

public class Heap {
        public static void main(String []args){
        int len;
        Heap obj = new Heap();
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
        System.out.println("Sorted array");
        for(int k=0;k<len;k++)
        {
            System.out.println(arr[k]);
        }
    }
        
    void sort(int arr[], int n){
        
        buildheap(arr,n);
        for (int i=n-1;i>=0;i--) 
        { 
            int temp = arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heap(arr, i, 0); 
        }  
    }
    
    void buildheap(int arr[],int n){
        for (int i=(n/2)-1;i>=0;i--) {
            heap(arr, n, i); 
        }
    }
        
    void heap(int arr[], int n, int i){
        int max = i;
        
        int l = (2*i)+1;
        int r = (2*i)+2;
        
        if(l<n && arr[l] > arr[max]){
            max = l;
        }
        
        if(r<n && arr[r] > arr[max]){
            max = r;
        }
        
        if(max != i){
            int temp = arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            heap(arr,n,max);
        }
    }
}

