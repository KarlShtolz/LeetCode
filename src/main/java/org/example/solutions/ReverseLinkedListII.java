package org.example.solutions;

import org.example.solutions.utils.ListNode;

import java.util.Stack;

/**
 * 92. Reverse Linked List II
 * Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the
 * list from position left to position right, and return the reversed list.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5], left = 2, right = 4
 * Output: [1,4,3,2,5]
 *
 * Example 2:
 * Input: head = [5], left = 1, right = 1
 * Output: [5]
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        for (int i = 1; i < left; i++)
            curr = curr.next;
        Stack<Integer> stack = new Stack<>();
        ListNode leftptr = curr;
        ListNode rightptr = curr;
        for (int i = left; i < right + 1; i++) {
            stack.push(rightptr.val);
            rightptr = rightptr.next;
        }
        for (int i = left; i < right + 1; i++) {
            leftptr.val = stack.pop();
            leftptr = leftptr.next;
        }
        return head;
    }
}
