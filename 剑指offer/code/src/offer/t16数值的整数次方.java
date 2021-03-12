package offer;

public class t16数值的整数次方 {
    public static void main(String[] a){
//        double x=2;
//        int n=-2;
//        Solution ff=new Solution();
//        System.out.println(ff.myPow(x,n));

        System.out.println(~15);

    }

}
//快速幂
/*注意几个位运算的方法*/
//class Solution {
//    public double myPow(double x, int n) {
//        if(x == 0) return 0;
//        long b = n;
//        double res = 1.0;
//        if(b < 0) {
//            x = 1 / x;
//            b = -b;
//        }
//        while(b > 0) {
////            b & 1 的意思就是b%2,但是更加快
//            if((b & 1) == 1) res *= x;
//            x *= x;
////            右移一位,相当于/2
//            b >>= 1;
//        }
//        return res;
//    }
//}
//
