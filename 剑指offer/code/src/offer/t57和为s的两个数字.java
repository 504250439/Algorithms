package offer;


import java.util.HashMap;
import java.util.HashSet;

public class t57和为s的两个数字 {
}


//本题可以利用hashmap来做 时间空间都为On
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashSet<Integer> set=new HashSet<>();
//        for (int i = 0; i <nums.length ; i++) {
//            if (!set.contains(target-nums[i])){
//                set.add(nums[i]);
//            }else{
//                return new int[]{nums[i],target-nums[i]};
//            }
//        }
//        return new int[0];
//    }
//}


//使用对撞指针,左右靠近,可以是空间复杂度降为01
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int i = 0, j = nums.length - 1;
//        while(i < j) {
//            int s = nums[i] + nums[j];
//            if(s < target) i++;
//            else if(s > target) j--;
//            else return new int[] { nums[i], nums[j] };
//        }
//        return new int[0];
//    }
//}

