package offer;

public class t25反转链表 {
}

// 主要是两种方法,迭代,递归,双指针也是可以的


//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode cur = head, pre = null;
//        while(cur != null) {
//            ListNode tmp = cur.next; // 暂存后继节点 cur.next
//            cur.next = pre;          // 修改 next 引用指向
//            pre = cur;               // pre 暂存 cur
//            cur = tmp;               // cur 访问下一节点
//        }
//        return pre;
//    }
//}
