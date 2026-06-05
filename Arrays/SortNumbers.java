public class SortNumbers {
    static void sort(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while(mid <= right) {
            if(nums[mid] == 0) {
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                mid++;
                left++;
            } else if(nums[mid] == 1) {
                mid++;
            } else { //mid == 2
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }
    }
    public static void main (String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sort(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
