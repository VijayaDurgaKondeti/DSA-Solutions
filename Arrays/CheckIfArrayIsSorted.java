public class CheckIfArrayIsSorted {
    static boolean isSorted(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,5};
        System.out.print(isSorted(nums));
    }
}
