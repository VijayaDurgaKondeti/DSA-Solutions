public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        //[1,1,2,2,3]
        int slow = 0;
        for(int fast=slow+1;fast<nums.length;fast++) {
            if(nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        System.out.println(removeDuplicates(nums));

        
    }
}
