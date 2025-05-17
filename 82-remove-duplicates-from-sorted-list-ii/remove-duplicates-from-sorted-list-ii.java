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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0); 
        ListNode tail = dummy;
        
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            boolean isUnique = true;

            if (prev != null && prev.val == curr.val) {
                isUnique = false;
            }
            if (curr.next != null && curr.next.val == curr.val) {
                isUnique = false;
            }
            
            if (isUnique) {
                tail.next = curr;
                tail = tail.next;
            }

            prev = curr;
            curr = curr.next;
        }
        tail.next = null; 
        return dummy.next;
    }
}