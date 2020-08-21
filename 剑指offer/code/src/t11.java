public class t11 {


}

//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  


//线性查找法
//class Solution {
//    public int minArray(int[] numbers) {
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i]<numbers[i-1]){
//                return numbers[i];
//            }
//        }
//        return numbers[0];
//
//    }
//}


//使用二分法,
//主要问题在当   m==j 的时候,不知道最小的数应该再左边定系右边,这时候我们就需要将j向前移动一个位置即可.

//class Solution {
//    public int minArray(int[] numbers) {
//        int i = 0, j = numbers.length - 1;
//        while (i < j) {
//            int m = (i + j) / 2;
//            if (numbers[m] > numbers[j]) i = m + 1;
//            else if (numbers[m] < numbers[j]) j = m;
//            else j--;
//        }
//        return numbers[i];
//    }
//}
//
