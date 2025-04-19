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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> nodeQueue=new LinkedList<>();
        nodeQueue.offer(root);
        boolean leftToRight =true;

        while(!nodeQueue.isEmpty()){
            int size = nodeQueue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for(int i=0;i<size;i++){
                TreeNode node = nodeQueue.poll();

                if(leftToRight){
                    level.addLast(node.val);
                }else{
                    level.addFirst(node.val);
                }

                if(node.left!=null) nodeQueue.offer(node.left);
                if(node.right!=null) nodeQueue.offer(node.right);
            }
            result.add(level);
            leftToRight=!leftToRight;
        }
        return result;
    }
}