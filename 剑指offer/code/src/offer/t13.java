package offer;

import java.util.LinkedList;
import java.util.Queue;

public class t13 {
}



//与上一题相近,可以利用深度优先算法和广度优先算法来解决

// class Solution {
//     public int movingCount(int m, int n, int k) {
//         //临时变量visited记录格子是否被访问过
//         boolean[][] visited = new boolean[m][n];
//         return dfs(0, 0, m, n, k, visited);
//     }
//
//     public int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
//         //i >= m || j >= n是边界条件的判断，k < sum(i, j)判断当前格子坐标是否
//         // 满足条件，visited[i][j]判断这个格子是否被访问过
//         if (i >= m || j >= n || k < sum(i, j) || visited[i][j])
//             return 0;
//         //标注这个格子被访问过
//         visited[i][j] = true;
//         //沿着当前格子的右边和下边继续访问
//         return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
//     }
//
//     //计算两个坐标数字的和
//     private int sum(int i, int j) {
//         int sum = 0;
//         while (i != 0) {
//             sum += i % 10;
//             i /= 10;
//         }
//         while (j != 0) {
//             sum += j % 10;
//             j /= 10;
//         }
//         return sum;
//     }
//
//}

//
//     public int movingCount(int m, int n, int k) {
//         //临时变量visited记录格子是否被访问过
//         boolean[][] visited = new boolean[m][n];
//         int res = 0;
//         //创建一个队列，保存的是访问到的格子坐标，是个二维数组
//         Queue<int[]> queue = new LinkedList<>();
//         //从左上角坐标[0,0]点开始访问，add方法表示把坐标
//         // 点加入到队列的队尾
//         queue.add(new int[]{0, 0});
//         while (queue.size() > 0) {
//             //这里的poll()函数表示的是移除队列头部元素，因为队列
//             // 是先进先出，从尾部添加，从头部移除
//             int[] x = queue.poll();
//             int i = x[0], j = x[1];
//             //i >= m || j >= n是边界条件的判断，k < sum(i, j)判断当前格子坐标是否
//             // 满足条件，visited[i][j]判断这个格子是否被访问过
//             if (i >= m || j >= n || k < sum(i, j) || visited[i][j])
//                 continue;
//             //标注这个格子被访问过
//             visited[i][j] = true;
//             res++;
//             //把当前格子右边格子的坐标加入到队列中
//             queue.add(new int[]{i + 1, j});
//             //把当前格子下边格子的坐标加入到队列中
//             queue.add(new int[]{i, j + 1});
//         }
//         return res;
//     }
//
//     //计算两个坐标数字的和
//     private int sum(int i, int j) {
//         int sum = 0;
//         while (i != 0) {
//             sum += i % 10;
//             i /= 10;
//         }
//         while (j != 0) {
//             sum += j % 10;
//             j /= 10;
//         }
//         return sum;
//     }
//
