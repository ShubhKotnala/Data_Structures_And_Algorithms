/*

Given an integer n, return true if it is a power of three. Otherwise, return false.

Input: n = 27
Output: true
Explanation: 27 = 33

Input: n = 0
Output: false
Explanation: There is no x where 3^x = 0.

Input: n = -1
Output: false
Explanation: There is no x where 3^x = (-1).

*/
class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n == 0 || n == 1)
            return false;
        while(n != 1)
        {
            if(n % 3 != 0)
            return false;
            n = n / 3;    
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("27 is power of 3 ? " + isPowerOfThree(27));
        System.out.println("19683 is power of 3 ? " + isPowerOfThree(19683));
        System.out.println("14348907 is power of 3 ? " + isPowerOfThree(14348907));
        System.out.println("14348908 is power of 3 ? " + isPowerOfThree(14348908));
        System.out.println("0 is power of 3 ? " + isPowerOfThree(0));
        System.out.println("1 is power of 3 ? " + isPowerOfThree(1));
        System.out.println("-1 is power of 3 ? " + isPowerOfThree(-1));
        System.out.println("-3 is power of 3 ? " + isPowerOfThree(-1));
    }
    
}
