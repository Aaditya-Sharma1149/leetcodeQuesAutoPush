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
    public ListNode reverseList(ListNode head) {
        ListNode PrevNode=null;
        ListNode NextNode;
        while(head!=null){
            NextNode=head.next;     //storing next node
            head.next=PrevNode;     //reversing 

            PrevNode=head;          //updating  prev & current node's
            head=NextNode;
        }
        return PrevNode;
    }
}