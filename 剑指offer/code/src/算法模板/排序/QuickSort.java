package 算法模板.排序;

public class QuickSort {

    public static void quickSort(int[] nums,int left,int right){
        if(left>right){
            return;
        }

        int key=nums[left];
        int i=left;
        int j=right;

        while (i<j){
            while (nums[j]>=key && i<j){
                j--;
            }
            while (nums[i]<=key && i<j){
                i++;
            }
            if (i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }

        nums[left]=nums[i];
        nums[i]=key;

        quickSort(nums,left,i-1);
        quickSort(nums,i+1,right);
    }

    public static void main(String[] args) {
        int[] q = {23,3,26,24,5,1,12,21,29,15,17,10,7,22,6,20,19,11,2,1,4,9,25,13,27,14,18,28,8,16,30};
        int len=q.length;
        quickSort(q, 0, len - 1);

        for (int i = 0; i <len ; i++) {
            System.out.print(q[i]+" ");
        }

    }
}