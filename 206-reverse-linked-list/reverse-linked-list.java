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
    ListNode newnode= null;

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        rec(head, prev);
        return newnode;
    }

    public void rec(ListNode head, ListNode prev){
        ListNode nextnode = null;
        if(head == null){
            newnode = prev;
            return;
        }

        nextnode = head.next;
        head.next = prev;

        rec(nextnode,head);
    }
        
}
