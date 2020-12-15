package Search;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while(1) {
            int mid = Math.floorDiv(left + right, 2);
            int midValue = arr[mid];

            if (midValue == target) {
                return mid;
            }else if {
                // Add else if and else blocks:
            }else {

            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 28;

        System.out.println(search(searchable, target));
    }

}