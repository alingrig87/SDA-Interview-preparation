package _01_fundamentals.bit_manipulation.power_of_two;

public class Solution {
    public static boolean isPowerOfTwo(int n) {
        while(n > 1) {
            if(n % 2 != 0) return false;
            n = n/2; 
        }
        return true;
    }

    public static boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(48));
        System.out.println(isPowerOfTwo2(8192));
    }
}
