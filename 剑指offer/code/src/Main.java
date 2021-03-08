import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int INF = Integer.MAX_VALUE;
    private int[][] dist;
    //顶点i 到 j的最短路径长度，初值是i到j的边的权重
    private int[][] path;
    private List<Integer> result = new ArrayList<>();


    public static void main(String[] args) {
        //创建一个5x5的邻接矩阵来存储图
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int begin = in.nextInt();
        int end = in.nextInt();
        int[][] matrix=new int[n][n];

        if (n+begin+end==0){
            System.out.printf("0");
            return;
        }


        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        while (a+b+c!=0){
            matrix[a][b]=c;
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (matrix[i][j]==0){
                    matrix[i][j]=INF;
                }
            }
        }



        Main graph = new Main(n);

        graph.findCheapestPath(begin, end, matrix);
        List<Integer> list = graph.result;
        System.out.println(graph.dist[begin][end]);
    }

    public void findCheapestPath(int begin, int end, int[][] matrix) {
        //求出matrix的最短路径
        floyd(matrix);
        result.add(begin);
        findPath(begin, end);
        result.add(end);
    }

    public void findPath(int i, int j) {
        // 找到路由节点
        int k = path[i][j];
        if (k == -1)
            return;
        // 从i到路由节点进行递归寻找中间节点
        findPath(i, k);
        result.add(k);
        // 从j到路由节点进行递归寻找中间节点
        findPath(k, j);
    }

    public void floyd(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                path[i][j] = -1;
                dist[i][j] = matrix[i][j];
            }
        }
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        // 更新i和j两点间的距离
                        dist[i][j] = dist[i][k] + dist[k][j];
                        // 记录从i点到j点序列的，中间第一个节点k
                        path[i][j] = k;
                    }
                }
            }
        }
    }

    public Main(int size) {
        this.path = new int[size][size];
        this.dist = new int[size][size];
    }
}