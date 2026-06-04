public class LongestSubarrayWithSumK {
    static int longestSubarray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int sum = nums[0];

        while(right < nums.length) {

            while(left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if(sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;

            if(right < nums.length)
                sum += nums[right];
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        System.out.println(longestSubarray(nums, k));
    }
}