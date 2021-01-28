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

//https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
//144. 二叉树的前序遍历

class Solution {

   //这里应该是先申明一个list
   List<Integer> result_arr ;

   public List<Integer> preorderTraversal(TreeNode root) {
        
        result_arr = new ArrayList<>() ;
        order(root) ;
        return result_arr;

    }

    public void order(TreeNode root){
 
        if(root == null){
        // return 这里也要加 ; 分号 
            return ;
        }
        result_arr.add(root.val); 
        
        order(root.left); 
        order(root.right); 

        
    }


}
