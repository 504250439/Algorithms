package offer;

import java.util.HashMap;
import java.util.Map;

public class t10 {
}

//递归的方法
//class Solution {
//    int constant = 1000000007;
//
//    public int fib(int n) {
//        return pp(n,new HashMap());
//    }
//
//    public int pp(int n, HashMap<Integer,Integer> map){
//        if (n<2) {
//            return n;
//        }
//
//        if (map.containsKey(n)){
//            return map.get(n);
//        }
//        int first=pp(n-1,map) % constant;
//        map.put(n-1,first);
//
//        int second=pp(n-2,map) % constant;
//        map.put(n-2,second);
//
//        int res=(first+second) % constant;
//        map.put(n,res);
//
//        return res;
//    }
//}

//动态规划法
//class Solution {
//    int constant = 1000000007;
//    public int fib(int n) {
//        if (n<2){
//            return n;
//        }
//        int a=0;
//        int b=1;
//        int sum=0;
//        for (int i = 2; i <= n; i++) {
//            sum=(a+b) % constant;
//            a=b;
//            b=sum;
//        }
//
//        return sum;
//    }
//}
