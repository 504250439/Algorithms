package everyday;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @description:
 * @author: Qiu wenhao
 * @create: 2021-03-14 09:10
 **/
//public class t705设计哈希集合 {
//}

// 实现一个hashset 主要的为什么基准是769,
// 因为他是一个质数,这就

// 当元素是个有规律的等差数列时，并且和基数（数组大小）最大公约数不为1时，就会造成哈希映射时冲突变高（数组某些位置永远不会有值）。比如数列0，6，12，18，24...，
//base为10，取模放入哈希表中位置将只能在0,2,4,6,8这几个数组位置上
//但我们如果把base取7（数组大小甚至比10小），同样数列可以分布在哈希表中的0,1,2,3,4,5,6
//可以使得哈希表中每个位置都“有用武之地”


//
//class MyHashSet {
//    private static final int BASE = 769;
//    private LinkedList[] data;
//
//    /** Initialize your data structure here. */
//    public MyHashSet() {
//        data = new LinkedList[BASE];
//        for (int i = 0; i < BASE; ++i) {
//            data[i] = new LinkedList<Integer>();
//        }
//    }
//
//    public void add(int key) {
//        int h = hash(key);
//        Iterator<Integer> iterator = data[h].iterator();
//        while (iterator.hasNext()) {
//            Integer element = iterator.next();
//            if (element == key) {
//                return;
//            }
//        }
//        data[h].offerLast(key);
//    }
//
//    public void remove(int key) {
//        int h = hash(key);
//        Iterator<Integer> iterator = data[h].iterator();
//        while (iterator.hasNext()) {
//            Integer element = iterator.next();
//            if (element == key) {
//                data[h].remove(element);
//                return;
//            }
//        }
//    }
//
//    /** Returns true if this set contains the specified element */
//    public boolean contains(int key) {
//        int h = hash(key);
//        Iterator<Integer> iterator = data[h].iterator();
//        while (iterator.hasNext()) {
//            Integer element = iterator.next();
//            if (element == key) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static int hash(int key) {
//        return key % BASE;
//    }
//}