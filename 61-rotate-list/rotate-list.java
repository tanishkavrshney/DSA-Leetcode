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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || head.next == null || k == 0) return head; 

        ListNode temp =head;
        int c=1;
        while(temp.next!=null){
            temp=temp.next;
            c++;
        }
        int newk = k%c;
        if(newk==0) return head;
        int c1=1;
        ListNode pmet = head;
        while(c1<c-newk){
            pmet = pmet.next;
            c1++;
        }
        ListNode newhead=pmet.next;
        pmet.next=null;
        temp.next=head;

        
    return newhead;
    }
}