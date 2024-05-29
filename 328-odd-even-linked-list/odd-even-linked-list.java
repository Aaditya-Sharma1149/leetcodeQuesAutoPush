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
    public ListNode oddEvenList(ListNode head) {
        
        if ( head == null) return head;     //empty LL

        ListNode temp = head;
        ListNode even = head.next;
        ListNode nextNode;
        ListNode prev = null;
        int count = 1;
        while ( temp.next != null ){
            nextNode = temp.next;
            temp.next = temp.next.next;

            prev = temp;
            temp = nextNode;        //updating temp
            count++;
        }
        if ( count%2 ==1 ){    // odd length LL
            temp.next = even;  

        }else{
            prev.next=even;
        }
        return head;
    }
}