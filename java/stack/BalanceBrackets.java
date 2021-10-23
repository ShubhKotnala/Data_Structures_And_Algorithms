//Problem Statement
// {}()
// ({()})
// {}(
// []

//output
// true
// true
// false
// true

import java.util.*;

public class BalanceBrackets {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        while (sc.hasNext()) {
            String input = sc.next();
            stack.push(input);
        }
        boolean[] result = new boolean[stack.size()];
        while (stack.size() > 0) {
            String s = stack.pop();
            Stack<Character> st = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                    st.push(s.charAt(i));
                } else if (!st.empty() && ((s.charAt(i) == ']' && st.peek() == '[')
                        || (s.charAt(i) == '}' && st.peek() == '{') || (s.charAt(i) == ')' && st.peek() == '('))) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }

            }
            if (st.empty()) {
                result[stack.size()] = true;
            }
        }
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
        sc.close();
    }
}
