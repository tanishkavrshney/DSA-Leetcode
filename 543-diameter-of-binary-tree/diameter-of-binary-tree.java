/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        check(root,diameter);
        return diameter[0];
    }
    public int check(TreeNode root,int[] diameter){
        if(root==null) return 0;
        int left=check(root.left,diameter);
        int right=check(root.right,diameter);
        diameter[0]=Math.max((left+right),diameter[0]);
        return (Math.max(left,right)+1);
    }
}