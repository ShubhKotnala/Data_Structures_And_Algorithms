/* Author : Shuyin Liu
 * Problem : To find the longest common prefix string amongst an array of strings, input on command line.
 * Explanation : Sample command --  java LongestCommonPrefix apple application appointment
 */

class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.print("The common prefix is:");
        if (args.length == 0) {
            System.out.println("");
            return;
        }
        if (args.length == 1) {
            System.out.println(args[0]);
            return;
        }

        String prev = args[0];

        for (int i = 1; i < args.length; i++) {
            prev = getCommonPrefix(prev, args[i]);
            if (prev.isEmpty()) {
                System.out.println("");
                return;
            }
        }

        System.out.println(prev);
    }

    private static String getCommonPrefix(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                sb.append(a.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
