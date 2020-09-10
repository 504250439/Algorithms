package offer;

public class t52两个链表的第一个公共节点 {
}



//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }
//
////  这道题思路有点特别哈,双方遍历一遍指针转移到对方链表上即可
//class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) return null;
//        ListNode node1=headA;
//        ListNode node2=headB;
//        while (node1!=node2){
//            node1=(node1==null)?headB:node1.next;
//            node2=(node2==null)?headA:node2.next;
//        }
//        return node1;
//    }
//}
//
