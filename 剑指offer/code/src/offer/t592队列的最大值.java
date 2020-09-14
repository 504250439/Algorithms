package offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class t592队列的最大值 {
}

//维护一个双端队列即可

//class MaxQueue {
//    Queue<Integer> queue;
//    Deque<Integer> help;//使用双端队列
//    public MaxQueue() {
//        queue = new LinkedList<>();
//        help = new LinkedList<>();
//    }
//    //若辅助队列为空，返回-1，不然就返回队首
//    public int max_value() {
//        if(help.isEmpty()) return -1;
//        return help.peekFirst();
//    }
//    //队列常规加入，辅助队列需要判断，加入的元素要满足辅助队列从大到小，比当前小的就要删除，然后加入自己的位置，注意点这里相同的也需要加入！
//    public void push_back(int value) {
//        queue.offer(value);
//        //辅助队列保持从大到小
//        while(!help.isEmpty() && value > help.peekLast()){
//            help.removeLast();
//        }
//        help.addLast(value);
//    }
//    //如果常规队列是空就返回-1，不然正常返回，辅助队列需要判断是否是最大值，是的话就要删除，但不影响相同最大值。
//    public int pop_front() {
//        if(queue.isEmpty()) return -1;
//        int e = queue.remove();
//        if(e == help.peekFirst()){
//            help.removeFirst();
//        }
//        return e;
//    }
//}

