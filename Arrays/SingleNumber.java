import java.util.*;

public class SingleNumber {

    static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find element with frequency 1
        for(int num : nums) {
            if(map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};

        System.out.println(singleNumber(nums));
    }
}