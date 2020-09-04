package offer;

public class t42连续子数组的最大和 {
}



//动态规划问题
//找到转移方程就可以很方便地求解出来
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int max = nums[0];
//        int former = 0;//用于记录dp[i-1]的值，对于dp[0]而言，其前面的dp[-1]=0
//        int cur = nums[0];//用于记录dp[i]的值
//        for(int num:nums){
//            cur = num;
//            if(former>0) cur +=former;
//            if(cur>max) max = cur;
//            former=cur;
//        }
//        return max;
//    }
//}