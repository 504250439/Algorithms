public class t25 {
}




//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dum = new ListNode(0), cur = dum;
//
//        while(l1!=null && l2!=null){
//            if (l1.val<l2.val){
//                cur.next=l1;
//                l1=l1.next;
//            }else{
//                cur.next=l2;
//                l2=l2.next;
//            }
//            cur=cur.next;
//        }
//        if (l1==null){
//            cur.next=l2;
//        }else{
//            cur.next=l1;
//        }
//        return dum.next;
//
//    }
//}