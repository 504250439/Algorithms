package everyday;

public class t34在排序数组中查找元素的第一个和最后一个位置二分查找 {
}


//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1; // 注意
//        while(left <= right) {
//            int mid = left + (right - left) / 2;
//            if(nums[mid] == target) {
//                if (nums[mid] == nums[mid+1]) {
//                    return new int[]{mid , mid+1};
//                } else {
//                    if (mid!=1){
//                        return new int[]{mid-1, mid};
//                    }else{
//                        return new int[]{mid};
//                    }
//                }
//            }else if (nums[mid] < target)
//                left = mid + 1; // 注意
//            else if (nums[mid] > target)
//                right = mid - 1; // 注意
//        }
//
//        return new int[]{-1,-1};
//    }
//}