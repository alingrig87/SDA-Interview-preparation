package _02_data_structures.arrays.find_max_element;

public class Solution {
    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for(int i = 1; i <= numbers.length - 1; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 8, 22, 5, 55, 999, 1};
        System.out.println(findMax(numbers));
    }
}
