package offer;

import java.util.ArrayList;
import java.util.List;

public class t06从尾到头打印链表 {
}

//可以使用 递归 或者是 使用辅助栈


//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}
//class Solution {
//    public int[] reversePrint(ListNode head) {
//        List res=new ArrayList();
//        while(head!=null){
//            res.add(head.val);
//            head=head.next;
//        }
//
//        int[] r=new int[res.size()];
//        for (int i = res.size()-1; i >=0 ; i--) {
//            r[res.size()-i-1]=(int) res.get(i);
//        }
//        return r;
//
//    }
//}

// 辅助栈
// 利用栈进行先进后出的操作
//class Solution {
//    public int[] reversePrint(ListNode head) {
//        Stack<ListNode> stack = new Stack<ListNode>();
//        ListNode temp = head;
//        while (temp != null) {
//            stack.push(temp);
//            temp = temp.next;
//        }
//        int size = stack.size();
//        int[] print = new int[size];
//        for (int i = 0; i < size; i++) {
//            print[i] = stack.pop().val;
//        }
//        return print;
//    }
//}
//
