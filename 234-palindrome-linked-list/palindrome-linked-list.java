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
    ListNode fast;
    ListNode Head;

    public boolean isPalindrome(ListNode head) {

        ListNode mid = half(head);          

        if ( fast == null){                  //even length LL
            reverse(mid);
        }else{                               //odd length LL
            reverse(mid.next);
        }

        return palindrome(head,Head);       
        
    }
    public void reverse(ListNode head){         //reversing LL
        ListNode temp = head;
        ListNode NextNode;
        ListNode prev = null;
        while ( temp != null){
            NextNode = temp.next;
            temp.next = prev;

            prev = temp;
            temp = NextNode;
        }
        Head = prev;
        //prev is 1st node of 2nd linked list;
    }
    public ListNode half(ListNode head){
        ListNode slow = head;
        fast = head;

        while ( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow for even len LL is starting node for next half
        //slow for odd  len LL is last node of 1st half
        return slow;

    }
    public boolean palindrome(ListNode head, ListNode head2){
        while ( head != null && head2 != null){
            if ( head.val != head2.val){
                return false;
            }
            head  = head.next;
            head2 = head2.next;
        }
        return true;
    }
}