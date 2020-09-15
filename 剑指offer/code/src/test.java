import java.util.*;
//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }


public class test {
    public static void main(String[] args) {
        int i=1;
        int target=2;
        System.out.println(4&5);
        String test="abcd";
        System.out.println(test.substring(0,2));

    }

    public int add(int a, int b) {
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }


}




