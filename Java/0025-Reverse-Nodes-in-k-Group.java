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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(!checkK(head, k))
            return head;

        ListNode prev = null;
        ListNode next = head.next;
        ListNode dummy = head;

        for(int i = 0; i < k - 1; i++) {
            head.next = prev;
            prev = head;
            head = next;
            next = head.next;
        }
        head.next = prev;
        dummy.next = reverseKGroup(next, k);

        return head;
    }

    boolean checkK(ListNode head, int k) {
        int i = 0;
        while(head != null) {
            head = head.next;
            i++;
        }
        return i >= k;
    }
}