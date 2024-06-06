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
        if (head == null) return head;
        int i=0;
        k = k % len(head);
        if ( k== 0){
            return head;
        }
        
        ListNode temp = null;
        ListNode fast = head;
        ListNode slow = head;

        while(i!=k){
            fast=fast.next;
            i++;
        }
        if(fast == null){
            return head;
        }

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        temp = slow.next;
        slow.next = null;

        fast.next = head;

        return temp;
    }


    public int len(ListNode head){
        int i = 0;
        while( head != null){
            head = head.next;
            i++;
        }
        return i;
    }
}