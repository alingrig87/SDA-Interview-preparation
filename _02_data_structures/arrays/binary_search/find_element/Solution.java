package _02_data_structures.arrays.binary_search.find_element;

public class Solution {
    // O(log n)
    public static int binarySearch(int[] numbers, int value) {
        int left = 0;
        int right = numbers.length - 1;

        while(left <= right) {
            int mid = left + (right -left) / 2 ; // (left + right)/2
            if(numbers[mid] == value) {
                return mid;
            } else if (numbers[mid] > value) {
                right =  mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
