/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        
        // Compute the length of the linked list
        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        
        // Make it circular
        temp.next = head;
        
        // Find the new tail node
        ListNode newTail = head;
        for (int i = 0; i < len - (k % len) - 1; i++) {
            newTail = newTail.next;
        }
        
        // Find the new head
        ListNode newHead = newTail.next;
        
        // Break the circle
        newTail.next = null;
        
        return newHead;
    }
}

