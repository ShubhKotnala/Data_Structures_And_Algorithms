//Problem Statement : 
//MainStr = “abcdef”
//SmallStr= “bce”

//To find that SmallStr is a subsequence of main str or not?
//Sol:


import java.io.*;
 
class MyCode {
  public static void main (String[] args) {
  String mainStr = "abcdebfg";
  String shortStr = "bce";
  
  int p=0;
  int count=0;
  for(int i=0;i<shortStr.length;i++){
    int j=count;
    for(j;j<mainStr.length;j++){
      if(mainStr.charAt(j)==shortStr.charAt(i)){
        p++;
        count=j;
      }
  }
  if(p==shortStr.length){
    System.out.println("true");
  }
  else{
        System.out.println("false");
		}
	}	
}
}
