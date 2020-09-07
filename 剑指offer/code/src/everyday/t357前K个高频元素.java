package everyday;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class t357前K个高频元素 {
}

//class Solution {
//    public int[] topKFrequent(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        // 创建最小堆
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> map.get(o1) - map.get(o2));
//        for (int key : map.keySet()) {
//            minHeap.offer(key);
//            // 这里如果 size 大于 k 那就出队一个元素即堆中现存最小者,因为默认会保留较大元素
//            if (minHeap.size() > k) {
//                minHeap.poll();
//            }
//        }
//        // 最后建立数组接受前 k 个元素,堆中所剩 k 个元素即为所求
//        int[] ans = new int[k];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = minHeap.poll();
//        }
//        return ans;
//    }
//}

