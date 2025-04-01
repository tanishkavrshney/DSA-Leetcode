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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        int i=1;
        
        ListNode prevLeft = null;
        while(i<left){
            prevLeft = temp;
            temp=temp.next;
            i++;
        }
        ListNode leftNode = temp;

        ListNode temp1 = temp;
        while(i<right){
            temp1 = temp1.next;
            i++;
        }
        ListNode nextRight = temp1.next;

        temp1.next = null; 
        ListNode reversedHead = reverse(leftNode);

        if (prevLeft != null) {
            prevLeft.next = reversedHead;
        } else {
            head = reversedHead; 
        }
        leftNode.next = nextRight;

        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}