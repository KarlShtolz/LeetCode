package org.example.solutions;

import org.example.solutions.utils.ListNode;

/**
 * 203. Remove Linked List Elements
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val,
 * and return the new head.
 *
 * Example 1:
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 *
 * Example 2:
 * Input: head = [], val = 1
 * Output: []
 *
 * Example 3:
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode previous = dummy;
        while (current != null) {
            if (current.val == val) {
                previous.next = current.next;
            } else {
                previous = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
