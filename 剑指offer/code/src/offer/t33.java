package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class t33 {
//    public static void main(String[] args){
//        int[] p={4, 8, 6, 12, 16, 14, 10};
//        System.out.println(p[p.length-1]);
//        Solution solution=new Solution();
//        System.out.println(solution.verifyPostorder(p));
//
//    }

}
//递归求解
//每个子树都要去判断是否为
//class Solution {
//    public boolean verifyPostorder(int[] postorder) {
//        return recur(postorder, 0, postorder.length - 1);
//    }
//    boolean recur(int[] postorder, int i, int j) {
////        遍历到最后剩自己就返回
//        if(i >= j) return true;
//        int p = i;
//        while(postorder[p] < postorder[j]) p++;
//        int m = p;
//        while(postorder[p] > postorder[j]) p++;
////        p !=j就说明其中有元素大于或者小于第j个元素
//        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
//    }
//}
//


//递归的方法时间复杂度是n*n
//可以可以用辅助栈来解决,时间复杂度降为n
//后续遍历可以看成前序遍历的倒影即 [根节点,右子树,左子树]
//主要捉住两个规律
//挨着的两个数如果arr[i]<arr[i+1]，那么arr[i+1]一定是arr[i]的右子节点
//如果arr[i]>arr[i+1]，那么arr[i+1]一定是arr[0]……arr[i]中某个节点的左子节点，并且这个值是大于arr[i+1]中最小的
//public boolean verifyPostorder(int[] postorder) {
//    Stack<Integer> stack = new Stack<>();
//    int parent = Integer.MAX_VALUE;
//    //注意for循环是倒叙遍历的
//    for (int i = postorder.length - 1; i >= 0; i--) {
//        int cur = postorder[i];
//        //当如果前节点小于栈顶元素，说明栈顶元素和当前值构成了倒叙，
//        //说明当前节点是前面某个节点的左子节点，我们要找到他的父节点
//        while (!stack.isEmpty() && stack.peek() > cur)
//            parent = stack.pop();
//        //只要遇到了某一个左子节点，才会执行上面的代码，才会更
//        //新parent的值，否则parent就是一个非常大的值，也就
//        //是说如果一直没有遇到左子节点，那么右子节点可以非常大
//        if (cur > parent)
//            return false;
//        //入栈
//        stack.add(cur);
//    }
//    return true;
//}
//

