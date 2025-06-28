package _02_data_structures.arrays.binary_search.two_sum;
import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[][] numbersWithOldIndexes = new int[numbers.length][2];
        for(int i = 0; i <= numbers.length - 1; i++) {
            numbersWithOldIndexes[i][0] = numbers[i];
            numbersWithOldIndexes[i][1] = i;
        }

        Arrays.sort(numbersWithOldIndexes, (a,b) -> Integer.compare(a[0], b[0]));
        // Arrays.asList(numbersWithOldIndexes).stream().forEach(arr -> System.out.println(Arrays.toString(arr)));

        for(int i = 0; i <= numbersWithOldIndexes.length - 1; i++) {
            int complement = target - numbersWithOldIndexes[i][0];
            
            int index = binarySearch(numbersWithOldIndexes, i + 1, numbersWithOldIndexes.length - 1, complement);
            if(index != -1) {
                
                return new int[]  { Math.min(numbersWithOldIndexes[i][1], numbersWithOldIndexes[index][1]), 
                                    Math.max(numbersWithOldIndexes[i][1], numbersWithOldIndexes[index][1])
                                  };
            }
        }

        return new int[] {-1,-1};
    }

    public static int binarySearch(int[][] numbers, int left, int right, int value) {
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(numbers[mid][0] == value) {
                return mid;
            } else if(numbers[mid][0] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 8, 5, 12, 1, 2};
        System.out.println(Arrays.toString(twoSum(numbers, 4)));
    }
}
