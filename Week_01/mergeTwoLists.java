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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //判断空
    if(l1 == null){
        return l2;
    }
    else if(l2 == null){
        return l1;
    } 
    else if(l1.val < l2.val){
        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    }
    //注意这里不是写else if  而是 else 
    //如果写 else if 就会 报错 missing return statement
    else{
        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }

  }
} 
