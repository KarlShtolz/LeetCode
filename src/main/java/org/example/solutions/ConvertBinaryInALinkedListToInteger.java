package org.example.solutions;

import org.example.solutions.utils.ListNode;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either
 * 0 or 1. The linked list holds the binary representation of a number.
 * Return the decimal value of the number in the linked list.
 * The most significant bit is at the head of the linked list.
 *
 * Example 1:
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 *
 * Example 2:
 * Input: head = [0]
 * Output: 0
 */
public class ConvertBinaryInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        if (head.next == null && head.val == 0) {
            return 0;
        }
        StringBuilder tmp = new StringBuilder();
        int tmpInt = 0;
        while (true) {
            tmpInt = head.val;
            tmp.append(String.valueOf(tmpInt));
            if (head.next == null) {
                break;
            }
            head = head.next;
        }
        return Integer.parseInt(tmp.toString(), 2);
    }
    /**
     *   public int getDecimalValue(ListNode head) {
     *     int res = 0, p = 0;
     *     while(head != null){
     *       int num = head.val & 1;
     *       res = (res << 1) | num;
     *       head = head.next;
     *     }
     *     return res;
     *   }
     */
}
