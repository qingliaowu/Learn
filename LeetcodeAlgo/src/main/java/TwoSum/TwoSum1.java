package TwoSum;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/
//https://github.com/qingliaowu/LeetCodeAnimation/blob/master/0001-Two-Sum/Article/0001-Two-Sum.md
public class TwoSum1 {

    public static void main(String[] args) {
        //index 0,1,2,3
        int[] nums = {3,5,5,6};
        int[] test = new TwoSum1().twoSum(nums,11);
        System.out.println(Arrays.toString(test));
    }

    //Time complexity O(n^2), which is actually bad.
    public int[] twoSum(int[] nums, int target) {
        //nums.length = 4
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //5 != 11 - 3 = 8    i=0, j=1
                //5 != 11 - 3 = 8    i=0, j=2
                //6 != 11 - 3 = 8    i=0, j=3

                //5 != 11 - 5 = 6    i=1,j=2
                //6 == 11 - 5      i=1, j=3
                if (nums[j] == target - nums[i]) {
                    //return 1,3
                    return new int[] { i, j };

                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}