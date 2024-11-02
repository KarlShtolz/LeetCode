package org.example.solutions;

import org.example.solutions.utils.ListNode;

import java.util.ArrayList;

/**
 * 876. Middle of the Linked List
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 *
 * Example 2:
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ArrayList<ListNode> arr = new ArrayList<>();
        arr.add(head);
        while (head.next != null) {
            head = head.next;
            arr.add(head);
        }
        if (arr.size() == 2) {
            return arr.get(1);
        }
        int len = 0;
        if (arr.size() % 2 == 0) {
            len = arr.size() / 2 + arr.size() % 2;
        } else {
            len = arr.size() / 2;
        }
        return arr.get(len);
    }
}
