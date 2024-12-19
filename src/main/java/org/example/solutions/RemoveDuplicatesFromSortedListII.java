package org.example.solutions;

import org.example.solutions.utils.ListNode;

/**
 * 82. Remove Duplicates from Sorted List II
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers
 * from the original list. Return the linked list sorted as well.
 *
 * Example 1:
 * Input: head = [1,2,3,3,4,4,5]
 * Output: [1,2,5]
 *
 * Example 2:
 * Input: head = [1,1,1,2,3]
 * Output: [2,3]
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode();
        ans.next = head;
        ListNode prev = ans;
        ListNode curr = head;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return ans.next;
    }
}
