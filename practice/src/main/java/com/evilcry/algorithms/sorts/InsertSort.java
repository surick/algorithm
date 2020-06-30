package com.evilcry.algorithms.sorts;

/**
 * @author Jin
 * @since 2020/6/30
 */
public class InsertSort extends Example {

    public static void sort(Comparable[] a) { // 将a[]按升序排列
        int N = a.length;
        for (int i = 1; i < N; i++) { // 将 a[i] 插入到 a[i-1]、a[i-2]、a[i-3]...之中
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
    }
}
