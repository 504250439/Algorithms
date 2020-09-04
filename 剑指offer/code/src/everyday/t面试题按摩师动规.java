package everyday;

public class t面试题按摩师动规 {
}

//简单的动规
class Solution {
    public int massage(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }

        int max=0;
        int prepre=nums[0];
        int pre=nums[1]>nums[0]?nums[1]:nums[0];
        for (int i = 2; i < nums.length; i++) {
            max=Math.max(prepre+nums[i],pre);
            nums[i]=max;
            prepre=pre;
            pre=max;
        }


        return max;
    }
}