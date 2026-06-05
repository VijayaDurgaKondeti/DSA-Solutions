import java.util.*;
public class LongestSubarray {
    static int longestSubarray(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int maxLength = 0;

        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if(map.containsKey(sum-k)) {
                maxLength = Math.max(maxLength, i - map.get(sum-k));
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,-1,5,-2,3};
        int k = 3;
        System.out.println(longestSubarray(nums,k));
    }
}
