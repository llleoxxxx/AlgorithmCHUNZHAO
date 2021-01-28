/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

//前序遍历
//https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/

class Solution {
    //这里应该是先申明一个list
    List<Integer> result_arr ;

   public List<Integer> preorder(Node root) {
        result_arr = new ArrayList<>() ;
        order(root) ;
        return result_arr;
    }

    public void order(Node root){

        //每次对于输入做一次检查，详见第二周的最后一节课
        if(root == null){
        // return 这里也要加 ; 分号 
            return ;
        }


        //这里是前序遍历，这段代码写在这里 
        result_arr.add(root.val);

        //这个循环 是 java 
        for(Node child: root.children){
            order(child);
        }
  
    }


}
