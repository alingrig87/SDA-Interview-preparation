package _01_fundamentals.swap_two_elements;

public class Solution {
    public static void swapTwoElements(int a, int b) {
        System.out.println("a = "  + a + " b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = "  + a + " b = " + b);
    }

    public static void swapTwoElements2 (int a, int b) {
        System.out.println("a = "  + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "  + a + " b = " + b);
    }

    public static void swapTwoElements3(int a, int b) {
         System.out.println("a = "  + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = "  + a + " b = " + b);
    }

    public static void main(String[] args) {
        swapTwoElements3(10, 5);
    }
}
