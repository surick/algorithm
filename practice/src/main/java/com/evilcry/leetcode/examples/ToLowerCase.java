package com.evilcry.leetcode.examples;

/**
 * <a>https://leetcode.com/problems/to-lower-case/</a>
 * <p>
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 * <p>
 * Input: "here"
 * Output: "here"
 * Example 3:
 * <p>
 * Input: "LOVELY"
 * Output: "lovely"
 *
 * @author Jin
 * @since 2020/7/6
 */
public class ToLowerCase {

    public String toLowerCase(String str) {

        return str.toLowerCase();
    }

    /**
     * https://leetcode.com/problems/to-lower-case/discuss/148993/Java-no-library-methods
     *
     * @param str
     * @return
     */
    public String toLowerCase1(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }

    /**
     * Nice work. You can speed up your conversion with a bitwise Or with 32. (5th bit). No if statement and faster than adding or subtracting.
     *
     * @param str
     * @return
     */
    public String toLowerCase2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = (char) (str.charAt(i) | (char) (32));
            sb.append(c);
        }
        return sb.toString();
    }

    public String toLowerCase3(String str) {
        if (str == null)
            return null;

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c <= 'Z' && c >= 'A') {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
