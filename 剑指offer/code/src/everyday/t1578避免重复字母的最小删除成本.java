package everyday;

public class t1578避免重复字母的最小删除成本 {
}

//class Solution {
//    public int minCost(String s, int[] cost) {
//        int res=0;
//        int tmp;
//        for (int i = 0; i <s.length()-1 ; i++) {
//            if (s.charAt(i)==s.charAt(i+1)){
////                我们把连续字符中最大的留下来就可以了
//                res+=Math.min(cost[i],cost[i+1]);
////                把两个数中较大的移到后面,方便比较
//                if (cost[i]>cost[i+1]){
//                    cost[i+1]=cost[i];
//                }
//            }
//        }
//        return res;
//    }
//}
