package _03_HashTables.hash_tables.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //O(n)
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i <= numbers.length - 1; i++) {
            int complement = target - numbers[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }
}
