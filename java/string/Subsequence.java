/* Author : Paras Wadhwa
 * Problem : To find if one starting is a substring of another
 * Explanation : Any string containing exact same subsequence of the string in another
 */

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
