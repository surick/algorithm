package com.evilcry.leetcode.examples;

/**
 * <a>
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * </a>
 * <p>
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 * <p>
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * Example 3:
 * <p>
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 *
 * @author Jin
 * @since 2020/6/26
 */
public class RunningSumof1dArray {

    public int[] runningSum(int[] nums) {

        int[] res = new int[nums.length];

        for (int i = 0; i < res.length; i++) {

            res[i] = i == 0 ? nums[i] : res[i - 1] + nums[i];
        }

        return res;
    }
}
