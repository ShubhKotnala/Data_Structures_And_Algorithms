/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
  
Example 1:
    Input: s = "egg", t = "add"
    Output: true
    
Example 2:
    Input: s = "foo", t = "bar"
    Output: false

Example 3:
    Input: s = "paper", t = "title"
    Output: true

 */
 public class IsomorphicString {
     
    public static boolean isIsomorphic(String s, String t) {
        // Base case: for different length of two strings
        if(s.length() != t.length())
            return false;

        // Create two maps for s & t strings
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        // Traverse all elements through the loop
        for(int i = 0; i < s.length(); i++){
            // Compare the maps, if not equal, return false
            if(map1[s.charAt(i)] != map2[t.charAt(i)])
                return false;
            // Insert each character if string s and t into seperate map
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
		String s = "egg";
        String t = "add";
        System.out.printf("Is '%s' ismorphic to '%s'? " + (isIsomorphic(s, t)? "Yes" : "No"), s, t);
        s = "foo";
        t = "bar";
        System.out.printf("\nIs '%s' ismorphic to '%s'? " + (isIsomorphic(s, t)? "Yes" : "No"), s, t);
        s = "paper";
        t = "title";
        System.out.printf("\nIs '%s' ismorphic to '%s'? " + (isIsomorphic(s, t)? "Yes" : "No"), s, t);
	}

}
