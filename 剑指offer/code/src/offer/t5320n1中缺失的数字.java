package offer;

public class t5320n1中缺失的数字 {
}

// 排序数组中的搜索,使用二分法即可
//与上一题的解题原理相同
//class Solution {
//    public int missingNumber(int[] nums) {
//        int i = 0, j = nums.length - 1;
//        while(i <= j) {
//            int m = (i + j) / 2;
//            if(nums[m] == m) i = m + 1;
//            else j = m - 1;
//        }
//        return i;
//    }
//}
//
