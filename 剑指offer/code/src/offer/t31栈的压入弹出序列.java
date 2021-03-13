package offer;

import java.util.Stack;

public class t31栈的压入弹出序列 {
}


//这道题笔试经常考,我们只需要利用一个辅助栈去模拟push和pop,当他们栈顶相同的时候进行操作
//最后直接判断能否将栈pop到为空即可
//class Solution {
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        Stack<Integer> stack=new Stack<>();
//        int j=0;
//        for (int i = 0; i < pushed.length; i++) {
//            stack.push(pushed[i]);
//            while (!stack.isEmpty() &&popped[j]==stack.peek()){
//                stack.pop();
//                j++;
//            }
//        }
//        return stack.isEmpty();
//    }
//}
//
//
//
