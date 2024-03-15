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
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                sum+= l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum+= l2.val;
                l2 = l2.next;
            }
            sum += carry;
            ListNode next = new ListNode(sum%10);
            temp.next = next;
            temp = next;
            carry = sum/10;
            sum = 0;
        }
        if(carry == 1){
            ListNode next = new ListNode(carry);
            temp.next = next;
            temp = next;
        }
        return ans.next;
    }
}