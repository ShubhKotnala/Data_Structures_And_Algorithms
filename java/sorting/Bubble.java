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

public class Bubble {

     public static void main(String []args){
        int len;
        Bubble obj = new Bubble();
        Reader.init(System.in);
        
        System.out.println("Enter size of array");
        len = Reader.nextInt();
        
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

