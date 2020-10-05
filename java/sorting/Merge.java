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

public class Merge {
    public static void main(String []args){
        Reader.init(System.in);
        int len;
        Merge obj = new Merge();
        
        System.out.println("Enter size of array");
        len = Reader.nextInt();
        
        int []arr = new int[len];
        
        System.out.println("Enter array");
        for(int k=0;k<len;k++)
        {
            arr[k] = sc.nextInt();
        }
        
        obj.sort(arr,0,len-1); 
        
        System.out.println("Sorted array");
        for(int k=0;k<len;k++)
        {
            System.out.println(arr[k]);
        }
    }
    
    void sort(int arr[],int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            sort(arr,start,mid);
            sort(arr,(mid+1),end);
            mergesort(arr,start,mid,end);
        }     
    }
    
    void mergesort(int arr[], int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - (mid + 1) + 1;
        int []a1 = new int[n1];
        int []a2 = new int[n2];
        
        for(int i= 0; i < n1; i++){ 
            a1[i] = arr[i+start];
            System.out.println("one : "+ a1[i]);
        }
        
        for(int i= 0; i < n2; i++){
            a2[i] = arr[mid+1+i];
            System.out.println("two : "+ a2[i]);
        }
        int i=0,j=0,k=start;
        while(i < n1 && j < n2){
            if(a1[i] < a2[j]){
                arr[k] = a1[i];
                i++;
            }else{
                arr[k] = a2[i];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = a1[i];
            k++;
            i++;
        }
        
        while(j<n2){
            arr[k] = a2[j];
            k++;
            j++;
        }
    }
}
