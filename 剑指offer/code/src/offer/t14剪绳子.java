package offer;

public class t14剪绳子 {
}




//贪心算法,计算得到每次都与 e 呈相关关系
//两个结论
//每个数都相等的时候结果最大
//每次都是3的时候结果最大

//class Solution {
//    public int cuttingRope(int n) {
//        if(n <= 3) return n - 1;
//        long res=1L;
//        int p=(int)1e9+7;
//        //贪心算法，优先切三，其次切二
//        while(n>4){
//            res=res*3%p;
//            n-=3;
//        }
//        //出来循环只有三种情况，分别是n=2、3、4
//        return (int)(res*n%p);
//    }
//}