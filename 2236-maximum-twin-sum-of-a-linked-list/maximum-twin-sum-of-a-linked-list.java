class Solution {
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;

        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        int ans = 0;
        slow = prev;

        while(slow != null){
            ans = Math.max(ans, head.val + slow.val);
            head = head.next;
            slow = slow.next;
        }

        return ans;
    }
}