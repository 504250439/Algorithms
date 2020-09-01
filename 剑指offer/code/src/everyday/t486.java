package everyday;

import java.lang.reflect.Array;

public class t486 {
}

//递归求解
//class Solution {
//    public boolean PredictTheWinner(int[] nums) {
//        return total(nums, 0, nums.length - 1, 1) >= 0;
//    }
//
//    public int total(int[] nums, int start, int end, int turn) {
//        if (start == end) {
//            return nums[start] * turn;
//        }
////        返回左子树的最优解
//        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn);
////        返回右子树的最优解
//        int scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn);
////      如果是自己选,就选最大的那个结果
//        if(turn == 1){
//            return Math.max(scoreStart ,scoreEnd );
//        }else{
////          如果是人家选,就选一个最小的
//            return Math.min(scoreStart ,scoreEnd );
//        }
//    }
//}

//记忆递归,减少重复次数
//利用 一个二维数组记录计算的数,减少计算次数
class Solution {

    public boolean PredictTheWinner(int[] nums) {
        int[][]  meno=new int[nums.length][nums.length];
        return total(nums, 0, nums.length - 1, 1,meno) >= 0;
    }

    public int total(int[] nums, int start, int end, int turn,int[][] meno) {
        if (start == end) {
            return nums[start] * turn;
        }
        if (meno[start][end]!=0){
            return meno[start][end];
        }
//        返回左子树的最优解
        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn,meno);
//        返回右子树的最优解
        int scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn,meno);
//      如果是自己选,就选最大的那个结果
        if(turn == 1){
            meno[start][end]=Math.max(scoreStart ,scoreEnd );
        }else{
//          如果是人家选,就选一个最小的
            meno[start][end]=Math.min(scoreStart ,scoreEnd );
        }
        return meno[start][end];
    }
}