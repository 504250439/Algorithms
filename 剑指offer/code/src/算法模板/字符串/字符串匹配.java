package 算法模板.字符串;

import java.util.HashMap;

public class 字符串匹配 {
}


//使用sunday算法来求解
//class Sunday {
//    public int strStr(String haystack,String needle){
//        if (needle.equals(""))return 0;
//        int hLen=haystack.length();
////        模式的长度
//        int nLen=needle.length();
//        if (hLen<nLen)return -1;
////        创建偏移表
//        HashMap<Character,Integer> offsetMap=new HashMap<>();
//        for (int i=0;i<nLen;i++){
//            offsetMap.put(needle.charAt(i),nLen-i);
//        }
////        开始查找模式串
//        int idx=0;
////        循环直至idx+模式串长度>目标字符串长度
//        String cutHay=" ";
//        while (idx+nLen<=hLen){
////            截取目标字符串
//             cutHay = haystack.substring(idx, idx + nLen);
////            如果子串和模式串相等，则返回idx
//            if (cutHay.equals(needle)){
//                return idx;
//            }else {
////                边界处理
//                if(idx+nLen>=hLen)return -1;
////                如果子串在目标串中的后一个字符c是否存在于偏移表中
//                if (offsetMap.containsKey(haystack.charAt(idx+nLen))){
//                    idx+=offsetMap.get(haystack.charAt(idx+nLen));
//                }else {
//                    idx+=nLen;
//                }
//            }
//        }
//        return -1;
//    }
//}
//
