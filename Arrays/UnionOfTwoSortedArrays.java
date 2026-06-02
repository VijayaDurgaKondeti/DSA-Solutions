import java.util.*;

public class UnionOfTwoSortedArrays {

    public static List<Integer> findUnion(int[] nums1, int[] nums2) {
        List<Integer> union = new ArrayList<>();

        int i = 0, j = 0;
        int m = nums1.length;
        int n = nums2.length;

        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;

            } else if (nums1[i] > nums2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++;

            } else { // nums1[i] == nums2[j]

                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
            }
            i++;
        }

        while (j < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3, 4};
        int[] nums2 = {2, 3, 5};

        List<Integer> result = findUnion(nums1, nums2);

        System.out.println(result);
    }
}