package everyday;

import java.util.*;

public class t216组合总和3 {
}


//与前面3题一样,只要用回溯做全排列即可
//class Solution {
//    public List<List<Integer>> combinationSum3(int k, int n) {
//        List<List<Integer>> res=new ArrayList<>();
//        Deque<Integer> deque=new ArrayDeque<>();
////        先去排序
//        int[] candidates={1,2,3,4,5,6,7,8,9};
//        dfs(candidates,0,0,k,n,deque,res);
//        return res;
//    }
//
//
//    public void dfs(int[] candidates, int begin, int cur, int k,int target, Deque<Integer> deque,List<List<Integer>> res){
//        if(cur==target && deque.size()==k){
//            res.add(new ArrayList<>(deque));
//            return;
//        }
//        if (cur >target) {
//            return;
//        }
//
//        for (int i = begin; i <candidates.length; i++) {
//            if (cur<target){
//                cur+=candidates[i];
//                deque.addLast(candidates[i]);
//                dfs(candidates,i+1,cur,k,target,deque,res);
//                cur-=candidates[i];
//                deque.removeLast();
//            }
//        }
//    }
//}