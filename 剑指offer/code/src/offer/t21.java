package offer;

public class t21 {
}


//数组内元素交换替换,利用双指针来实现

//快慢指针
//class Solution {
//    public int[] exchange(int[] nums) {
//        int slow=0,fast=0;
//        while (fast<nums.length){
//            if ((nums[fast]&1)==1){
//                swap(nums,slow++,fast);
//            }
//            fast++;
//        }
//        return nums;
//    }
//
//    public void swap(int[] nums,int a,int b){
//        int temp = nums[a];
//        nums[a] = nums[b];
//        nums[b] =temp;
//        return;
//    }
//}
//
//
////首尾双指针
////一个在头一个在尾的方法
//class Solution {
//    public int[] exchange(int[] nums) {
//        int i = 0, j = nums.length - 1, tmp;
//        while(i < j) {
//            while(i < j && (nums[i] & 1) == 1) i++;
//            while(i < j && (nums[j] & 1) == 0) j--;
//            tmp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = tmp;
//        }
//        return nums;
//    }
//}
//
