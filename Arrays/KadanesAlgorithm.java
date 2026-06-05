public class KadanesAlgorithm {
    static int maxSubarraySum(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        for(int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(nums));
    }
}
