/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode MergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        var newHead = new ListNode(0);
        var runnerHead = newHead;
        while(list1 != null && list2 != null){
            if(list1.val >= list2.val){
                runnerHead.next = list2;
                list2 = list2.next;
            }else{
                runnerHead.next = list1;
                list1 = list1.next;
            }
            runnerHead = runnerHead.next;
        }
        if (list1 != null) runnerHead.next = list1;
        if (list2 != null) runnerHead.next = list2;
        
        return newHead.next;
        
    }
}