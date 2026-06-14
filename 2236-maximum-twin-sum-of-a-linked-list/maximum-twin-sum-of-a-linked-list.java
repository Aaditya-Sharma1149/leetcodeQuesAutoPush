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
    public int pairSum(ListNode head) {
        ListNode prevNode = null;
        ListNode tempHead = head;
        int ans = 0;
        int size = 0;
        while(tempHead!=null){
            ListNode temp = new ListNode();
            temp.val = tempHead.val;
            temp.next = prevNode;
            prevNode = temp;
            tempHead = tempHead.next;
            size++;
        }
        size = size/2;
        ListNode temp = prevNode;
        while(size>0){
            ans = Math.max(head.val + temp.val,ans);
            head = head.next;
            temp = temp.next;
            size--;
        }
        return ans;
    }
}