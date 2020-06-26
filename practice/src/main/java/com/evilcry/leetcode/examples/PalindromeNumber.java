package com.evilcry.leetcode.examples;

/**
 *
 * <a>https://leetcode.com/problems/palindrome-number/</a>
 *
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 *
 * @author Jin
 * @since 2020/6/26
 */
public class PalindromeNumber {

    /**
     * 字符串解法
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String s = ((Integer) x).toString();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * TODO discuss里的 看不懂
     * @param x
     * @return
     */
    public boolean isPalindrome1(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }

    /**
     * TODO discuss里的 看不懂
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        if (x < 0) return false;
        int y = x;
        int res = 0;
        while (y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
    }
}
