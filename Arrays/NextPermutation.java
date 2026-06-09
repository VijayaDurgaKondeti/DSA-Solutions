public class NextPermutation {
    static void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }

        if(pivot == -1) {
            reverse(nums, 0, nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>pivot;i--) {
            if(nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        reverse(nums, pivot+1, nums.length-1);
    }

    static void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args)  {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
