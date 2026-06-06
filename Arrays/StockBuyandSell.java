public class StockBuyandSell {
    static int maxProfit(int[] nums) {
        int maxprofit = 0;
         int minPrice = nums[0];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] < minPrice) {
                minPrice = nums[i];
            }

            int profit = nums[i] - minPrice;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.print(maxProfit(nums));
    }
}