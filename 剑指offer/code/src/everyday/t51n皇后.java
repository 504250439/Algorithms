package everyday;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class t51n皇后 {
}



//n皇后问题,利用回溯算法求解
//注意主对角线与副对角线的判断问题
//主对角线:(横坐标-中坐标)=固定值
//副对角线:(横坐标+中坐标)=固定值

//public class Solution {
//
//    private int n;
//    // 记录某一列是否放置了皇后
//    private boolean[] col;
//    // 记录主对角线上的单元格是否放置了皇后
//    private boolean[] main;
//    // 记录了副对角线上的单元格是否放置了皇后
//    private boolean[] sub;
//    private List<List<String>> res;
//
//    public List<List<String>> solveNQueens(int n) {
//        res = new ArrayList<>();
//        if (n == 0) {
//            return res;
//        }
//
//        // 设置成员变量，减少参数传递，具体作为方法参数还是作为成员变量，请参考团队开发规范
//        this.n = n;
//        this.col = new boolean[n];
//        this.main = new boolean[2 * n - 1];
//        this.sub = new boolean[2 * n - 1];
//        Deque<Integer> path = new ArrayDeque<>();
//        dfs(0, path);
//        return res;
//    }
//
//    private void dfs(int row, Deque<Integer> path) {
//        if (row == n) {
//            // 深度优先遍历到下标为 n，表示 [0.. n - 1] 已经填完，得到了一个结果
//            List<String> board = convert2board(path);
//            res.add(board);
//            return;
//        }
//
//        // 针对下标为 row 的每一列，尝试是否可以放置
//        for (int j = 0; j < n; j++) {
//            if (!col[j] && !main[row + j] && !sub[row - j + n - 1]) {
//                path.addLast(j);
//                col[j] = true;
//                main[row + j] = true;
//                sub[row - j + n - 1] = true;
//
//                dfs(row + 1, path);
//                // 递归完成以后，回到之前的结点，需要将递归之前所做的操作恢复
////                在同一个数组上操作,减少递归新建数组的空间浪费
//                sub[row - j + n - 1] = false;
//                main[row + j] = false;
//                col[j] = false;
//                path.removeLast();
//            }
//        }
//    }
////构造结果的结构
//    private List<String> convert2board(Deque<Integer> path) {
//        List<String> board = new ArrayList<>();
//        for (Integer num : path) {
//            StringBuilder row = new StringBuilder();
//            row.append(".".repeat(Math.max(0, n)));
//            row.replace(num, num + 1, "Q");
//            board.add(row.toString());
//        }
//        return board;
//    }
//}
//
