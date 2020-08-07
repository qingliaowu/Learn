package TwoSum;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/
//https://github.com/qingliaowu/LeetCodeAnimation/blob/master/0001-Two-Sum/Article/0001-Two-Sum.md

//To improve our run time complexity, we need a more efficient way to check if
// the complement exists in the array. If the complement exists, we need to
// look up its index. What is the best way to maintain a mapping of each element
// in the array to its index? A hash table.


public class TwoSum2 {

    public static void main(String[] args) {
        //index 0,1,2,3
        int[] nums = {3,5,5,6};
        int[] test = new TwoSum1().twoSum(nums,11);
        System.out.println(Arrays.toString(test));
    }


    public int[] twoSum(int[] nums, int target) {

        return [0,1]

    }
}
/*
This is a Brute Force approach
Time complexity O(n^2) : For each element, we try to find its complement by looping through the rest of array which takes O(n) time.
Space complexity O(1)

 */
