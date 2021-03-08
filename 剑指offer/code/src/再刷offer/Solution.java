package 再刷offer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class A {
    public void print() {
        System.out.println("A:print");
    }
}

class B extends A {
    @Override
    public void print() {
        System.out.println("B:print");
    }
}

class C extends B {
    @Override
    public void print() {
        System.out.println("C:print");
    }
}


class Solution {
    public static void main(String[] args) {
        A a = new B();                 //向上转型 (B类是A的子类)

        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);


    }


}

class CQueue {

    LinkedList<Integer> A,B;

    public CQueue() {
        A=new LinkedList<Integer>();
        B=new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if (!B.isEmpty()){
            return B.removeLast();
        }

        if (B.isEmpty()){
            if (A.isEmpty()){
                return -1;
            }
            while (!A.isEmpty()){
                B.addLast(A.removeLast());
            }
        }
        return B.removeLast();
    }
}
