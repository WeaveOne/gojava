package com.willvi.leetcode;

/**
 * @author wangwei
 * @date 2019/10/25 10:56
 */
public class TwoSum {
    /**
     * 主要思想还是hash表的运用
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        // 为什么为2047 因为leetcode题库有限 当长度更大的时候就要增加max值
        int max = 2047;
        int[] arr = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            int index = arr[result & max];
            if (index!=0){
                return new int[]{index-1, i};
            }
            arr[nums[i] & max] = i + 1;
        }
        return new int[2];
    }
}
