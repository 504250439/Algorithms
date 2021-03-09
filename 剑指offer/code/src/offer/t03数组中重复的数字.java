package offer;

import java.util.HashSet;

public class t03数组中重复的数字 {
}

//class Solution {
//    public int findRepeatNumber(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            //位置正确，先不用管
//            if (i == nums[i])
//                continue;
//            //出现了重复，直接返回
//            if (nums[i] == nums[nums[i]]) {
//                return nums[i];
//            }
//            //交换
//            int temp = nums[nums[i]];
//            nums[nums[i]] = nums[i];
//            nums[i] = temp;
//            //这里的i--是为了抵消掉上面的i++，
//            //交换之后需要原地再比较
//            i--;
//        }
//        return -1;
//    }
//}


class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return 0;
    }
}