class Solution {
    public void main(String []args) {

          Deque<String> deque = new LinkedList<String>();

          //根据文档，deque的push相当于在头部添加元素
          deque.addFirst("a"); 
          deque.addFirst("b");
          deque.addFirst("c");


          System.out.println(deque);
          
          //peek 用 peekFirst 替代
          String str = deque.peekFirst(); 
          System.out.println(str);
          System.out.println(deque);
          
          
          //remove 用 removeFirst 替代
          while(deque.size() > 0){
              System.out.println(deque.removeFirst()); 
          }
          System.out.println(deque);
        }
        
}
