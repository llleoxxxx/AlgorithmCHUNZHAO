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

//94. 二叉树的中序遍历
//https://leetcode-cn.com/problems/binary-tree-inorder-traversal/

class Solution {

   //这里应该是先申明一个list
   List<Integer> result_arr ;

   public List<Integer> inorderTraversal(TreeNode root) {
        
        result_arr = new ArrayList<>() ;
        order(root) ;
        return result_arr;

    }

    public void order(TreeNode root){
 
        if(root == null){
        // return 这里也要加 ; 分号 
            return ;
        }

        
        order(root.left); 
        
        result_arr.add(root.val); 
        
        order(root.right); 

        
    }


}
