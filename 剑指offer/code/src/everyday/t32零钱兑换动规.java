package everyday;
import java.lang.reflect.Array;
import java.util.Arrays;

public class t32零钱兑换动规 {
}

//动态规划求解这个问题
//class Solution {
//    public int coinChange(int[] coins, int amount) {
//        int[] dp=new int[amount+1];
//        Arrays.fill(dp,amount+1);
//        dp[0]=0;
//
//
//        for (int i = 1; i <=amount; i++) {
//            for(int coin:coins){
//                if (i>=coin && dp[i-coin]!=-1){
//                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
//                }
//            }
//        }
//
//        if (dp[amount]==amount+1){
//            dp[amount]=-1;
//        }
//        return dp[amount];
//
//    }
//}