package org.example.solutions;

import java.util.ArrayList;

/**
 * 19. Remove Nth Node From End of List
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * Example 1:
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 *
 * Example 2:
 * Input: head = [1], n = 1
 * Output: []
 *
 * Example 3:
 * Input: head = [1,2], n = 1
 * Output: [1]
 */

public class RemoveNthNodeFromEndofList {
    public int len(ListNode head,int n){
        int count=1;
        ListNode temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count-n+1;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=len(head,n);
        ListNode prev=null;
        ListNode temp=head;
        for(int i=1;i<length;i++){
            prev=temp;
            temp=temp.next;
        }
        if(prev==null) {
            return head=head.next;
        } else {
            prev.next=temp.next;
            return head;
        }
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
    }
}
