/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        while ( tempA != tempB ){
            if ( tempA == null && tempB == null ){
                return null;
            }
            if (tempA == null){
                tempA = headB;
                continue;
            }
            if ( tempB == null){
                tempB = headA;
                continue;
            }
            tempA = tempA.next;
            tempB = tempB.next;

        }
        return tempA;
    }
}