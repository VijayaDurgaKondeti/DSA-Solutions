import java.util.*;
public class LeadersInArray {
    static List<Integer> leader(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int maxRight = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i] >= maxRight) {
                maxRight = nums[i];
                result.add(nums[i]);
            }
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-3, 4, 5, 1, -4, -5};
        System.out.print(leader(nums));

    }
}
