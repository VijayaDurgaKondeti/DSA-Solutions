public class LongestSubarrayWithSumK {
    static int longestSubarray(int[] nums, int k) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right < nums.length) {
            sum += nums[right];
            while(sum > k) {
                sum -= nums[left];
                left++;
            }
            if(sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            } 
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,1,1,4,2};
        int k = 3;
        System.out.print(longestSubarray(nums,k));
    }
}