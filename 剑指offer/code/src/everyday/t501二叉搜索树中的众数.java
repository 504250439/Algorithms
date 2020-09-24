package everyday;

import 算法模板.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class t501二叉搜索树中的众数 {
}

// 先利用hashmap黎存放,再遍历hashmap
//class Solution {
//    private Map<Integer, Integer> map;
//    private int count, max;
//    public int[] findMode(TreeNode root) {
//        if (root == null)
//            return new int[0];
//        map = new HashMap<>();
//        count =  0;
//        max = 0;
//        midTraversal2(root);
//        int[] res = new int[count];
//        for(int key : map.keySet()){
//            if(map.get(key) == max)
//                res[--count] = key;
//        }
//        return res;
//    }
//
//    private void midTraversal2(TreeNode x){
//        if(x == null)
//            return;
//        int temp = map.getOrDefault(x.val, 0) + 1;
//        map.put(x.val, temp);
//        if(temp > max){
//            max = temp;
//            count = 1;
//        } else if(temp == max){
//            count++;
//        }
//        midTraversal2(x.left);
//        midTraversal2(x.right);
//    }
//
//
//}