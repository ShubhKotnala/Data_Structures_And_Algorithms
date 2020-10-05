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

public class Selection {

     public static void main(String []args){
        int len;
        Selection obj = new Selection();
        Reader.init(System.in);
        System.out.println("Enter size of array");
        len = Reader.nextInt();
        
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
