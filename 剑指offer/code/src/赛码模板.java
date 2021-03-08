//
////2、中文大写金额数字到“元”为止的，在“元”之后，应写“整字，如￥ 532.00应写成“人民币伍佰叁拾贰元整”。在”角“和”分“后面不写”整字。（30分）
////1、中文大写金额数字前应标明“人民币”字样。中文大写金额数字应用壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、仟、万、亿、元、角、分、零、整等字样填写。（30分）
//import java.io.*;
//import java.util.*;
//
//import java.util.Scanner;
//
//
//import java.util.Scanner;
//
// class Main {
//    private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
//    private String[] unitArr_Integer = {"拾", "佰", "仟", "万"};
//    private String[] unitArr_Decimal = {"分", "角"};
//
//    //针对整数部分
//    private String toHanStr_Integer(String numStr) {
//        String result = "";
//        int numLen = numStr.length();
//        for (int i = 0; i < numLen; i++) {
//            int num = numStr.charAt(i) - 48;
//            if (i != numLen - 1 && num != 0) {
//                result += (hanArr[num] + unitArr_Integer[numLen - 2 - i]);
//            } else {
//                if (hanArr[num].equals("零") && result.substring(result.length() - 1, result.length()).equals("零")) {
//                    continue;
//                } else {
//                    result += hanArr[num];
//                }
//            }
//        }
//        return result;
//    }
//
//    //针对小数部分
//    private String toHanStr_Decimal(String numStr) {
//        String result = "";
//        int numLen = numStr.length();
//        for (int i = 0; i < numLen; i++) {
//            int num = numStr.charAt(i) - 48;
//            if (i != numLen && num != 0) {
//                result += (hanArr[num] + unitArr_Decimal[numLen - 1 - i]);
//            }
//        }
//        return result;
//    }
//
//    //对整数和小数进行分离，用String[]作为返回值类型
//    private String[] divide(double num) {
//        long zheng = (long) num;//强制转换，得到整数部分
//        long xiao = Math.round((num - zheng) * 100);//round函数，四舍五入接近整数
//        return new String[]{zheng + "", String.valueOf(xiao)};
//    }
//
//    public static void main(String[] args) {
//        Main nr = new Main();//根据类Rmb创建一个nr对象
//        Scanner node = new Scanner(System.in);
//        double input = node.nextDouble();
//        String[] str = nr.divide(input);//将整数部分和小数部分分开
//        String Integer = nr.toHanStr_Integer(str[0]);//对整数部分进行人民币读法转换
//        String Decimal = nr.toHanStr_Decimal(str[1]);//对小数部分进行人民币读法转换
//        String Id = Integer + "元" + Decimal;//将整数小数组合在一起
//        System.out.println("人民币"+Id);
//    }
//}
//
//public class 赛码模板 {
//}