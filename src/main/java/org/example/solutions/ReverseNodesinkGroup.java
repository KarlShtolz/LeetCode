package org.example.solutions;

/**
 * 25. Reverse Nodes in k-Group
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a
 * multiple of k then left-out nodes, in the end, should remain as it is.
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 *
 * Example 2:
 * Input: head = [1,2,3,4,5], k = 3
 * Output: [3,2,1,4,5]
 */
public class ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        int group_count = 0;
        ListNode temp_head = head;
        while(temp_head != null){
            group_count++;
            temp_head = temp_head.next;
        }
        group_count /= k;
        ListNode result = new ListNode(0);
        ListNode tail = result;
        while(group_count-- > 0){
            ListNode temp_tail = head;
            int i = k;
            ListNode prev = null, curr = head, next = head.next;
            while(i-- > 0){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null) next = next.next;
            }
            tail.next = prev;
            tail = temp_tail;
            head = curr;
        }
        if(head != null) {
            tail.next = head;
        }
        return result.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
