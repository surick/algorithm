package com.evilcry.leetcode.examples;

import java.util.HashSet;
import java.util.Set;

/**
 * <a> https://leetcode.com/problems/jewels-and-stones/</a>
 * <p>
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 * <p>
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 *
 * @author Jin
 * @since 2020/6/28
 */
public class JewelsandStones {

    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        char[] s = S.toCharArray();


        for (char c : s) {

            if (J.contains(c + "")) {
                sum++;
            }
        }

        return sum;
    }

    /**
     * 比上面快
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones2(String J, String S) {
        int sum = 0;

        Set<Character> setJ = new HashSet<>();
        for (char j: J.toCharArray()){
            setJ.add(j);
        }

        for (char c : S.toCharArray()) {

            if (setJ.contains(c)) {
                sum++;
            }
        }

        return sum;
    }

    public int numJewelsInStones1(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }
}
