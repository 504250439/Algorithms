import java.util.ArrayList;
import java.util.List;

public class t04 {
}

//可以使用 递归 或者是 使用辅助栈


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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