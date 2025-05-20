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
    public int[] nextLargerNodes(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, ListNode> indexToNode = new HashMap<>();

        ListNode temp = head;
        int idx = 0;

        while (temp != null) {
            indexToNode.put(idx, temp);

            while (!stack.isEmpty() && temp.val > indexToNode.get(stack.peek()).val) {
                int prevIndex = stack.pop();
                map.put(prevIndex, temp.val);
            }

            stack.push(idx);
            temp = temp.next;
            idx++;
        }

        int[] res = new int[idx];
        for (int i = 0; i < idx; i++) {
            res[i] = map.getOrDefault(i, 0);
        }

        return res;
    }
}
