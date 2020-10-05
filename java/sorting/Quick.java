class Reader {
	static BufferedReader reader;
	static StringTokenizer tokenizer;
	static void init(InputStream input) {
	    reader = new BufferedReader(
	                 new InputStreamReader(input) );
	    tokenizer = new StringTokenizer("");
	}


	static String next() throws IOException {
	    while ( ! tokenizer.hasMoreTokens() ) {


	        tokenizer = new StringTokenizer(
	               reader.readLine() );
	    }
	    return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {

		return Integer.parseInt( next() );
	}
		
	static double nextDouble() throws IOException {
	    return Double.parseDouble( next() );
	}
}

public class Quick {
    public static void main(String []args){
        int len;
        Quick obj = new Quick();
        Reader.init(System.in);
        
        System.out.println("Enter size of array");
        len = Reader.nextInt();
        
        int []arr = new int[len];
        
        System.out.println("Enter array");
        for(int k=0;k<len;k++)
        {
            arr[k] = sc.nextInt();
        }
        
        obj.sort(arr,0 ,len-1); 
        System.out.println("Sorted array");
        for(int k=0;k<len;k++)
        {
            System.out.println(arr[k]);
        }
    }
    
    void sort(int arr[],int start, int end){
        
        if(start < end){
            int p = pivot(arr,start,end);
            sort(arr, start , p-1);
            sort(arr, p+1 , end);
        }
    }
    
    int pivot(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start - 1;
        
        for(int j=start;j<end;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       int tem = arr[i+1];
       arr[i+1] = arr[end];
       arr[end] = tem; 
       
       return (i+1);
        
    }    
}
