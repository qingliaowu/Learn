package Search;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        // Add left and right variables below
        int left = 0;
        int right = arr.length;


        // Add mid calculation below
        int mid = Math.floorDiv(left+right, 2);

        int midValue = arr[mid];

        if(midValue == target){
            return mid;
        }

        // 2. Create a conditional below

        return -1;

    }

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 41;

        System.out.println(search(searchable, target));
    }

}