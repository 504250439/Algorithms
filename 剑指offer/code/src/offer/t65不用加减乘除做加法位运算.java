package offer;

public class t65不用加减乘除做加法位运算 {
}

//利用二进制的位运算来解决
//分开两步计算
//计算临时值,不进位的
//然后再计算进位的值
//最后循环相加即可
//class Solution {
//    public int add(int a, int b) {
//        while (b != 0) {
//            int tempSum = a ^ b;
//            int carrySum = (a & b) << 1;
//            a = tempSum;
//            b = carrySum;
//        }
//        return a;
//    }
//
//}
