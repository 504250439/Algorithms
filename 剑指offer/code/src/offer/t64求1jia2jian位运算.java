package offer;

public class t64求1jia2jian位运算 {
}



//本题用常规的递归会使用到if来判断退出递归
//利用&&短路的特性来解决
//if(A && B)  // 若 A 为 false ，则 B 的判断不会执行（即短路），直接判定 A && B 为 false

//class Solution {
//    public int sumNums(int n) {
//        int sum = n;
//        boolean b = (n > 0) && ((sum += sumNums(n - 1)) > 0);
//        return sum;
//    }
//
//
//}

