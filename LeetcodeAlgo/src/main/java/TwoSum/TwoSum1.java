package TwoSum;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/
//https://github.com/qingliaowu/LeetCodeAnimation/blob/master/0001-Two-Sum/Article/0001-Two-Sum.md
public class TwoSum1 {

    public static void main(String[] args) {
        int[] data = {2,5,5,6};
        int[] test = new TwoSum1().twoSum(data,10);
        System.out.println(Arrays.toString(test));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) { // Time complexity O(n^2)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}