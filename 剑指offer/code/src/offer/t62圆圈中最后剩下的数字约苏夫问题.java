package offer;

public class t62圆圈中最后剩下的数字约苏夫问题 {
}

//利用反推求得答案
//约苏夫问题
//从结果上的模反推回去原来所在的位置
//class Solution {
//    public int lastRemaining(int n, int m) {
//        int ans = 0;
//        // 最后一轮剩下2个人，所以从2开始反推
//        for (int i = 2; i <= n; i++) {
//            ans = (ans + m) % i;
//        }
//        return ans;
//    }
//}
