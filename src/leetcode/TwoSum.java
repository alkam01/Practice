package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,8,12};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    int[] k= { i, j };
                    System.out.println(Arrays.toString(k));
                }
            }
        }
    }
}
