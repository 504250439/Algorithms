package everyday;

public class t1047删除字符串中的所有相邻重复项 {


    public static String removeDuplicates(String S) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        t1047删除字符串中的所有相邻重复项.removeDuplicates("abbaca");
    }

}
