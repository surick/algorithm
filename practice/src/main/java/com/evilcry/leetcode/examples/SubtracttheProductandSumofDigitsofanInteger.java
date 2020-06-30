package com.evilcry.leetcode.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * <a>https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/</a>
 * <p>
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 * Example 2:
 * <p>
 * Input: n = 4421
 * Output: 21
 * Explanation:
 * Product of digits = 4 * 4 * 2 * 1 = 32
 * Sum of digits = 4 + 4 + 2 + 1 = 11
 * Result = 32 - 11 = 21
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 10^5
 *
 * @author Jin
 * @since 2020/6/30
 */
public class SubtracttheProductandSumofDigitsofanInteger {

    /**
     * 1ms
     *
     * @param n
     * @return
     */
    public int subtractProductAndSum(int n) {

        String s = Integer.valueOf(n).toString();

        int product = 1, sum = 0;
        for (char c : s.toCharArray()) {
            product *= Integer.parseInt(String.valueOf(c));
            sum += Integer.parseInt(String.valueOf(c));
        }

        return product - sum;
    }

    public int subtractProductAndSum1(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }

    public int subtractProductAndSum2(int n) {
        int sum = 0, prod = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }
        return prod - sum;
    }
}
