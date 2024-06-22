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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode result = sum;
        int carry = 0;

        while(l1 != null || l2 != null){
            int l1_val = l1 == null ? 0 : l1.val;
            int l2_val = l2 == null ? 0 : l2.val;

            int temp_sum = l1_val + l2_val + carry;
            sum.next = new ListNode(temp_sum%10);
            carry = temp_sum/10;

            if(l1 != null)  
                l1 = l1.next;

            if(l2 != null)
                l2 = l2.next;

            sum = sum.next;
        }
        if(carry != 0 ){
            sum.next = new ListNode(carry);
        }
        return result.next;
    }
}