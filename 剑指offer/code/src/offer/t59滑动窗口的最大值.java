package offer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class t59滑动窗口的最大值 {
}



//暴力求解.遍历即可
//class Solution {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        //边界条件判断
//        if (nums == null || nums.length == 0)
//            return new int[0];
//        int res[] = new int[nums.length - k + 1];
//        for (int i = 0; i < res.length; i++) {
//            int max = nums[i];
//            //在每个窗口内找到最大值
//            for (int j = 1; j < k; j++) {
//                max = Math.max(max, nums[i + j]);
//            }
//            res[i] = max;
//        }
//        return res;
//    }
//}



//双端队列求解
//保证队列中第一个为最大,如果后面插入的大,就把前面小的删掉
//如果插入小的话就放着
//class Solution {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if(nums.length == 0 || k == 0) return new int[0];
//        Deque<Integer> deque = new LinkedList<>();
////        Deque<Integer> deque = new ArrayDeque<>();
//        int[] res = new int[nums.length - k + 1];
//        for(int j = 0, i = 1 - k; j < nums.length; i++, j++) {
//            if(i > 0 && deque.peekFirst() == nums[i - 1])
//                deque.removeFirst(); // 删除 deque 中对应的 nums[i-1]
//            while(!deque.isEmpty() && deque.peekLast() < nums[j])
//                deque.removeLast(); // 保持 deque 递减
//            deque.addLast(nums[j]);
//            if(i >= 0)
//                res[i] = deque.peekFirst();  // 记录窗口最大值
//        }
//        return res;
//    }
//}


