package com.evilcry.leetcode.examples;

/**
 * <a>https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/</a>
 * <p>
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 * Example 2:
 * <p>
 * Input: head = [0]
 * Output: 0
 * Example 3:
 * <p>
 * Input: head = [1]
 * Output: 1
 * Example 4:
 * <p>
 * Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 * Output: 18880
 * Example 5:
 * <p>
 * Input: head = [0,0]
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The Linked List is not empty.
 * Number of nodes will not exceed 30.
 * Each node's value is either 0 or 1.
 *
 * @author Jin
 * @since 2020/7/3
 */
public class ConvertBinaryNumberinaLinkedListtoInteger {


    public int getDecimalValue(ListNode head) {

        int sum = 0;
        int i = 0;
        while (head != null) {

            sum += head.val * Math.pow(2, i);
            head = head.next;
            i++;
        }
        return sum;
    }


    /**
     * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/discuss/451815/JavaPython-3-Simulate-binary-operations.
     *
     * @param head
     * @return
     */
    public int getDecimalValue1(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = (ans << 1) | head.val;
            head = head.next;
        }
        return ans;
    }

    /**
     * We initialise an integer variable num to 0. For each node in the linked list, we will left shift num by 1 position to make way for the val in the next node in linked list. This is same as multiplying num by 2, but using the left shift operator makes it easier to visualise how the binary number is being made. For eg. if num in binary is 10, after left shift it would become 100.
     *
     * @param head
     * @return
     */
    public int getDecimalValue2(ListNode head) {
        int num = 0;                // Initialise num to 0
        while (head != null) {         // Iteratore over the linked list until head is null
            num <<= 1;              // Left shift num by 1 position to make way for next bit
            num += head.val;        // Add next bit to num at least significant position
            head = head.next;       // Update head
        }
        return num;
    }

    public int getDecimalValue3(ListNode head) {
        int num = 0;
        while (head != null) {
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
