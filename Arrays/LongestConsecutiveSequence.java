import java.util.*;
public class LongestConsecutiveSequence {
    static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        int maxLen = 0;
        for(int num : nums) {
            if(!set.contains(num-1)) {
                int curr = num;
                int count = 1;

                while(set.contains(curr+1)) {
                    curr++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
