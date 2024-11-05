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
    public boolean isSymmetric(TreeNode root) {
        
       return equal(root.right,root.left);
    }
    public static boolean equal(TreeNode right,TreeNode left){
        if(right==null&&left==null)
            return true;
         if(right==null||left==null)
            return false;
        
       return right.val==left.val && equal(right.right,left.left) &&  equal(right.left,left.right);
       
        
    }
}