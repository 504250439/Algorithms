import java.util.*;

public class test {
    public static void main(String[] args) {
//        Integer[] intArr = {new Integer(2), new Integer(1), new Integer(9), new Integer(5)};
//        Queue<Integer> pq = new PriorityQueue<>();
//
//        for (int i = 0; i <intArr.length ; i++) {
//            pq.add(intArr[i]);
//        }
//
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
        A classA = new B();
        System.out.println(classA.a);
        classA.fun();
    }



}
//teste
class A {
    public int a = 0;
    public void fun(){
        System.out.println("A");
    }
}

class B extends A {
    public int a = 1;

    public void fun() {
        System.out.println("B");
    }

}
