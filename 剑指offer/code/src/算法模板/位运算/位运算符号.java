package 算法模板.位运算;

public class 位运算符号 {
    public static void main(String[] args) {
//        位运算
        System.out.println("与（&）、非（~）、或（|）、\n" +
                "异或（^）:对所有整数取反=本身的相反数-1");
        System.out.println("4&5="+(4&5));
        System.out.println("4|5="+(4|5));
        System.out.println("4^5="+(4^5));
        System.out.println("~4="+(~4));
//        补位的 << >>
//        记住最高位是1就补1,0补0
        System.out.println("4<<1="+(4<<1));
        System.out.println("4>>1="+(4>>1));

        //4&5=4
        //4|5=5
        //4^5=1
        //~4=-5
        //4<<1=8
        //4>>1=2

    }


}
