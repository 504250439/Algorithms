package everyday;

import java.util.*;

public class t40组合总和2 {
}

//同样也是全排列的问题
//class Solution {
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        List<List<Integer>> res=new ArrayList<>();
//        Deque<Integer> deque=new ArrayDeque<>();
////        先去排序
//        Arrays.sort(candidates);
//        dfs(candidates,0,0,target,deque,res);
//        return res;
//    }
//
//
//    public void dfs(int[] candidates, int begin, int cur, int target, Deque<Integer> deque,List<List<Integer>> res){
//        if(cur==target){
//            res.add(new ArrayList<>(deque));
//            return;
//        }
//        if (cur >target) {
//            return;
//        }
//
//        for (int i = begin; i <candidates.length; i++) {
////            添加剪枝,防止重复;
//            if (i > begin && candidates[i] == candidates[i - 1]) {
//                continue;
//            }
//            if (cur<target){
//                cur+=candidates[i];
//                deque.addLast(candidates[i]);
//                dfs(candidates,i+1,cur,target,deque,res);
//                cur-=candidates[i];
//                deque.removeLast();
//            }
//        }
//    }
//
//}