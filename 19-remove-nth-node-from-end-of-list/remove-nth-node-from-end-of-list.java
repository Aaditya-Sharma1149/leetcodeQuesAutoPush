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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        
        while( temp != null){
            ListNode node;
            node = temp;
            for ( int i = 0; i <= n; i++ ){
                node = node.next;
                if (node == null && i < n ){
                    return head.next;
                }
            }
            if ( node == null){
                temp.next = temp.next.next;
                return head;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}