package 算法模板.排序;

public class QuickSort {
    public static void quickSort(int[] q, int l, int r) {
        if (l >= r) return;
        int x = q[(l + r) >> 1];
        int i = l - 1;
        int j = r + 1;
        while (i < j) {
            do ++i; while (q[i] < x);
            do --j; while (q[j] > x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }

    public static void main(String[] args) {
        int[] q = {23,3,26,24,5,1,12,21,29,15,17,10,7,22,6,20,19,11,2,1,4,9,25,13,27,14,18,28,8,16,30};
        int len=q.length;
        quickSort(q, 0, len - 1);

        for (int i = 0; i <len ; i++) {
            System.out.print(q[i]+" ");
        }

    }
}