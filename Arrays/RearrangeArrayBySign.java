//Brute Force Approach
/* import java.util.*;
public class RearrangeArrayBySign {
    static int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int num : nums) {
            if(num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }
        for(int i=0;i<nums.length/2;i++) {
            nums[2*i] = pos.get(i);
            nums[2*i+1] = neg.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] result = rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
} */

//Optimal Approach
import java.util.*;
public class RearrangeArrayBySign {
    static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] < 0) {
                result[negIndex] = nums[i];
                negIndex += 2;
            } else {
                result[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.print(Arrays.toString(rearrangeArray(nums)));
    }
}
