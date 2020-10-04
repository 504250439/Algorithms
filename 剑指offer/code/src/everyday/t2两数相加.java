package everyday;

public class t2两数相加 {
}


//直接移动指针进行计算，记录进位即可
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode p = null;
//        ListNode a = l1;
//        ListNode b = l2;
//        //定义一个进位标志
//        int carry = 0;
//        while(a!=null || b!=null) {
//            //a和b节点的值相加，如果有进位还要加上进位的值
//            int val = (a==null?0:a.val) + (b==null?0:b.val) + carry;
//            //根据val判断是否有进位
//            carry = val>=10? 1:0;
//            //不管有没有进位，val都应该小于10
//            val = val%10;
//            p = (a==null? b : a);
//            p.val = val;
//            //a和b指针都前进一位
//            a = (a==null? null : a.next);
//            b = (b==null? null : b.next);
//            //根据a和b是否为空，p指针也前进一位
//            p.next = (a==null? b : a);
//        }
//        //不要忘记最后的边界条件，如果循环结束carry>0说明有进位需要处理这个条件
//        if(carry>0) {
//            p.next = new ListNode(1);
//        }
//        //每次迭代实际上都是将val赋给a指针的，所以最后返回的是l1
//        return l1;
//    }
//}

