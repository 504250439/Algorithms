package everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class t16最接近的三数之和 {
}



//三数之和的进化版
//class Solution {
//    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
//        int result = nums[0] + nums[1] + nums[2];
//        for(int i=0;i<nums.length-2;i++){
//            int left = i+1;
//            int right = nums.length - 1;
//            while(left != right){
//                int sum = nums[i] + nums[left] + nums[right];
//                if(Math.abs(sum - target) < Math.abs(result - target))
//                    result = sum;
//                if(sum > target){
//                    right--;
//                    // 解决nums[right]重复
//                    while(left != right && nums[right] == nums[right+1])
//                        right--;
//                }
//                else{
//                    left++;
//                    // 解决nums[left]重复
//                    while(left != right && nums[left] == nums[left-1])
//                        left++;
//                }
//            }
//            // 解决nums[i]重复
//            while(i<nums.length-2 && nums[i] == nums[i+1])
//                i++;
//        }
//        return result;
//    }
//}
//
