public class SubarrayWithMaximumSum {
    static void subarray(int[] nums) {
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for(int i=0;i<nums.length;i++) {
            if(sum == 0) start = i;
            sum += nums[i];
            if(sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        for(int i=ansStart;i<=ansEnd;i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        subarray(nums);
    }
}
