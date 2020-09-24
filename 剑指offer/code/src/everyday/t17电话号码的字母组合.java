package everyday;

import java.util.ArrayList;
import java.util.List;

public class t17电话号码的字母组合 {
}
//
// 利用回溯法来做
//class Solution {
//
////    一个按键表
//    private String letterMap[] = {
//            " ",    //0
//            "",     //1
//            "abc",  //2
//            "def",  //3
//            "ghi",  //4
//            "jkl",  //5
//            "mno",  //6
//            "pqrs", //7
//            "tuv",  //8
//            "wxyz"  //9
//    };
//
//    List<String> list;
//    public List<String> letterCombinations(String digits) {
//        list=new ArrayList<>();
//        if (digits.length() == 0) {
//            return list;
//        }
//
//        dfs(digits,new StringBuilder(),0);
//        return list;
//    }
//    public void dfs(String digits,StringBuilder str,int index){
//        if (index==digits.length()){
//            list.add(str.toString());
//            return ;
//        }
//        Character a=digits.charAt(index);
//        String letter=letterMap[a-'0'] ;
//
//        for (int i = 0; i <letter.length() ; i++) {
//            dfs(digits,str.append(letter.charAt(i)),index+1);
//            str.deleteCharAt(str.length()-1);
//        }
//    }
//
//
//}



//class Solution {
//
//    //    一个按键表
//    private String letterMap[] = {
//            " ",    //0
//            "",     //1
//            "abc",  //2
//            "def",  //3
//            "ghi",  //4
//            "jkl",  //5
//            "mno",  //6
//            "pqrs", //7
//            "tuv",  //8
//            "wxyz"  //9
//    };
//
//    List<String> list;
//
//    public List<String> letterCombinations(String digits) {
//        list=new ArrayList<>();
//        if (digits.length() == 0) {
//            return list;
//        }
//
//        dfs(digits,"",0);
//        return list;
//    }
//
//    public void dfs(String digits,String str,int index){
//        if (index==digits.length()){
//            list.add(str);
//            return ;
//        }
//
//        Character a=digits.charAt(index);
//        String letter=letterMap[a-'0'] ;
//
//        for (int i = 0; i <letter.length() ; i++) {
//            dfs(digits,str+letter.charAt(i),index+1);
//        }
//
//
//
//    }
//
//
//}