package offer;

import java.util.Stack;

/**
 * @description:
 * @author: Qiu wenhao
 * @create: 2021-03-13 10:51
 **/
public class t30包含min函数的栈 {
}


// 使用两个栈去解决这个问题
// 辅助栈记录每次当前最小的那些


class MinStack {
    Stack<Integer> A, B;
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }
    public void push(int x) {
        A.add(x);
        if(B.empty() || B.peek() >= x)
            B.add(x);
    }
    public void pop() {
        if(A.pop().equals(B.peek()))
            B.pop();
    }
    public int top() {
        return A.peek();
    }
    public int min() {
        return B.peek();
    }
}

