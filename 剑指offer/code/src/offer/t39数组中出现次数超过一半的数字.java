package offer;

import 算法模板.排序.QuickSort;

import java.util.HashMap;
import java.util.HashSet;

public class t39数组中出现次数超过一半的数字 {
}
//方法1 hashmap
//放入hashmap当中进行判断
//class Solution {
//    public int majorityElement(int[] nums) {
//        int len=nums.length;
//        int num=len/2;
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            if (map.containsKey(nums[i])){
//                map.put(nums[i],map.get(nums[i])+1);
//            }else{
//                map.put(nums[i],1);
//            }
//            if (map.get(nums[i])>num){
//                return nums[i];
//            }
//
//
//        }
//
//        return 0;
//    }
//}


//方法二 : 排序,中位数一定系,所以时间复杂度为nlogn


//方法三:摩尔投票法
//超过一半,可以用投票的形式选出来
//class Solution {
//    public int majorityElement(int[] nums) {
//        int x = 0, votes = 0;
//        for(int num : nums){
//            if(votes == 0) x = num;
//            votes += num == x ? 1 : -1;
//        }
//        return x;
//    }
//}
//
