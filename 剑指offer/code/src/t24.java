import java.util.List;
import java.util.Stack;

public class t24 {
}


//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }

//利用双指针来求解
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        //申请节点，pre和 cur，pre指向null
//        ListNode pre = null;
//        ListNode cur = head;
//        ListNode tmp = null;
//        while(cur!=null) {
//            //记录当前节点的下一个节点
//            tmp = cur.next;
//            //然后将当前节点指向pre
//            cur.next = pre;
//            //pre和cur节点都前进一位
//            pre = cur;
//            cur = tmp;
//        }
//        return pre;
//    }
//}



//递归求解
//需要画图去理解
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if(head.next==null){
//            return head;
//        }
//        ListNode r=reverseList(head.next);
////        翻转指向
//        head.next.next=head;
//        head.next=null;
//        return r;
//    }
//}
//
