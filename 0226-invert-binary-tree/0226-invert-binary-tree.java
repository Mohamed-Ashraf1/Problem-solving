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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        invert(root.right);
        invert(root.left);
        return root;
    }
    public static void invert(TreeNode root){
        if(root==null)
            return;
        
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;

        invert(root.right);
        invert(root.left);

    }
}