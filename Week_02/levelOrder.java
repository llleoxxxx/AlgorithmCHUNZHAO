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

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        //用queue来存储节点，用list来存储数值
        List<Integer> values = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node nextNode = queue.remove();
            values.add(nextNode.val);

        for (Node child : nextNode.children) {
        queue.add(child);
        }
        }

}








//尝试用递归写，失败了

class Solution {
    //这里应该是先申明一个list
    List<List<Integer>> result_arr ;

   public List<List<Integer>> levelOrder(Node root) {
        result_arr = new ArrayList<>(new ArrayList<>()) ;
        List<Integer>  root_val = new ArrayList<>() ;
        root_val.add(root.val);
        result_arr.add(root_val);
        order(root) ;
        List<List<Integer>> final_arr = new ArrayList<>(new ArrayList<>()) ;  ;
        for (List<Integer> node :result_arr){
            if(!node.isEmpty()){
                final_arr.add(node);
            }
        }

        return final_arr;
    }

    public void order(Node root){
        
        if(root == null){
        // return 这里也要加 ; 分号 
            return ;
        }

        List<Integer> level_arr ;
        level_arr = new ArrayList<>() ;


        result_arr.add(level_arr);



        //这个循环 是 java 
        for(Node child: root.children){
        //不等于的写法要再注意
            level_arr.add(child.val);
            order(child);
  
            }
        
        
        //这里是每次在结果列表里面加入根节点的数值 
        //对这里不理解的地方在于 为什么这样写就自动变成了
        
    }


}
