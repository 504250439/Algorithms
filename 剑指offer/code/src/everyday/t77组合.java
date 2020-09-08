package everyday;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class t77组合 {
}

//经典回溯法
//class Solution {
//    public List<List<Integer>> combine(int n, int k) {
//        List<List<Integer>> res=new ArrayList<>();
//        if (k <= 0 || n < 0) {
//            return res;
//        }
//        Deque<Integer> path=new ArrayDeque<>();
//        dfs(n,k,1,path,res);
//        return res;
//    }
//
//
//    public void dfs(int n,int k,int bagin,Deque<Integer> path,List<List<Integer>> res){
//        if (path.size()==k){
//            res.add(new ArrayList<>(path));
//            return ;
//        }
//
//        for (int i = bagin; i <=n; i++) {
//            path.addLast(i);
//            dfs(n,k,i+1,path,res);
//            path.removeLast();
//        }
//
//    }
//
//}