public class LargestElement {
    static int largestElement(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,3};
        System.out.print(largestElement(arr));
    }
}