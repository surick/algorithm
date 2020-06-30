package com.evilcry.leetcode.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a>
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 * </a>
 * <p>
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * <p>
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
 * <p>
 * Return the decompressed list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 * Example 2:
 * <p>
 * Input: nums = [1,1,2,3]
 * Output: [1,3,3]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 100
 * nums.length % 2 == 0
 * 1 <= nums[i] <= 100
 *
 * @author Jin
 * @since 2020/6/29
 */
public class DecompressRunLengthEncodedList {

    /**
     * 10 ms
     *
     * @param nums
     * @return
     */
    public int[] decompressRLElist(int[] nums) {

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {

            while (nums[i] != 0) {

                res.add(nums[i + 1]);
                nums[i]--;
            }
        }

        int[] array = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }

        return array;
    }


    public int[] decompressRLElist1(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2)
            for (int j = 0; j < nums[i]; ++j)
                ans.add(nums[i + 1]);
        return ans.stream().mapToInt(i -> i).toArray();
    }

    public int[] decompressRLElist2(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }

    public int[] decompressRLElist3(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public int[] decompressRLElist4(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }

        int[] ans = new int[len];
        int index = 0;
        for (int i = 0; 2 * i + 1 < nums.length; i++) {
            for (int j = 0; j < nums[2 * i]; j++) {
                ans[index++] = nums[2 * i + 1];
            }
        }
        return ans;
    }


    /**
     * fast 0ms
     *
     * @param nums
     * @return
     */
    public int[] decompressRLElist5(int[] nums) {
        int size = 0;
        for (int i = 0, h = nums.length; i < h; i += 2) {
            size += nums[i];
        }
        int[] send = new int[size];
        for (int i = 0, k = 0, h = nums.length; i < h; i += 2) {
            int value = nums[i + 1];
            Arrays.fill(send, k, k + nums[i], value);
            k += nums[i];
        }
        return send;
    }
}
