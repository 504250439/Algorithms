package everyday;

import java.net.Inet4Address;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class t39组合总和全排列 {
}

//又是一个全排列问题,利用回溯通用模板进行二叉树的遍历计算即可
//class Solution {
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> res=new ArrayList<>();
//        Deque<Integer> deque=new ArrayDeque<>();
//        dfs(candidates,0,0,target,deque,res);
//        return res;
//    }
//
//    public void dfs(int[] candidates, int begin, int cur, int target, Deque<Integer> deque,List<List<Integer>> res){
//        if(cur==target){
//            res.add(new ArrayList<>(deque));
//            return;
//        }
//        if (cur >target) {
//            return;
//        }
//        for (int i = begin; i <candidates.length; i++) {
//            if (cur<target){
//                cur+=candidates[i];
//                deque.addLast(candidates[i]);
//                dfs(candidates,i,cur,target,deque,res);
//                cur-=candidates[i];
//                deque.removeLast();
//            }
//        }
//    }
//}