public class SecondLargest {
    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            }

            if(arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2};
        System.out.print(secondLargest(arr));
    }
}
