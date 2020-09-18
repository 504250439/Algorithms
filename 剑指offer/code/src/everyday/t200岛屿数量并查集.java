package everyday;

public class t200岛屿数量并查集 {
}


//利用并查集来解决
//class Solution {
//
//    public int numIslands(char[][] grid) {
//        int rows = grid.length;
//        if (rows == 0) {
//            return 0;
//        }
//        int cols = grid[0].length;
//
//        int size = rows * cols;
//        // 两个方向的方向向量（理解为向下和向右的坐标偏移）
//        int[][] directions = {{1, 0}, {0, 1}};
//        // +1 是认为虚拟的水域
//        UnionFind unionFind = new UnionFind(size + 1);
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//
//                if (grid[i][j] == '1') {
//                    for (int[] direction : directions) {
//                        int newX = i + direction[0];
//                        int newY = j + direction[1];
//                        if (newX < rows && newY < cols && grid[newX][newY] == '1') {
//                            unionFind.union(cols * i + j, cols * newX + newY);
//                        }
//                    }
//                } else {
//                    // 如果不是陆地，所有的水域和一个虚拟的水域连接
//                    unionFind.union(cols * i + j, size);
//                }
//            }
//        }
//
//        // 减去那个一开始多设置的虚拟的水域
//        return unionFind.count - 1;
//    }
//
//
//    class UnionFind {
//
//        private int[] parent;
//        private int count;
//
//        public UnionFind(int n) {
//            this.count = n;
//            parent = new int[n];
//            for (int i = 0; i < n; i++) {
//                parent[i] = i;
//            }
//        }
//
//        /**
//         * 返回索引为 p 的元素的根结点
//         *
//         * @param p
//         * @return
//         */
//        public int find(int p) {
//            // 在 find 的时候执行路径压缩
//            while (p != parent[p]) {
//                // 两步一跳完成路径压缩，这里是「隔代压缩」
//                // 说明：「隔代压缩」和「按秩合并」选择一个实现即可，「隔代压缩」的代码量少，所以选它
//                parent[p] = parent[parent[p]];
//                p = parent[p];
//            }
//            return p;
//        }
//
//        public boolean connected(int p, int q) {
//            int pRoot = find(p);
//            int qRoot = find(q);
//            return pRoot == qRoot;
//        }
//
//        public void union(int p, int q) {
//            int pRoot = find(p);
//            int qRoot = find(q);
//            if (pRoot == qRoot) {
//                return;
//            }
//            parent[qRoot] = pRoot;
//            // 每次 union 以后，连通分量减 1
//            count--;
//        }
//    }
//}


//岛屿问题:深度优先算法
//class Solution {
//    public int numIslands(char[][] grid) {
//        int count = 0;
//        for(int i = 0; i < grid.length; i++) {
//            for(int j = 0; j < grid[0].length; j++) {
//                if(grid[i][j] == '1'){
//                    dfs(grid, i, j);
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//    private void dfs(char[][] grid, int i, int j){
//        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
//        grid[i][j] = '0';
//        dfs(grid, i + 1, j);
//        dfs(grid, i, j + 1);
//        dfs(grid, i - 1, j);
//        dfs(grid, i, j - 1);
//    }
//}

