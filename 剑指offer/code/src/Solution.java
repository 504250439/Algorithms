class Solution {
    public static void main(String[] args) {
        int[][] test={{1,2},{3,5},{2,2}};
        System.out.println(maxAverageRatio(test,2));
    }

    public static double maxAverageRatio(int[][] classes, int extraStudents) {
        double[] a=new double[classes.length];

        for (int i = 0; i < classes.length; i++) {
//            a[i]=((double) classes[i][0])/((double) classes[i][1]);
//            a[i]=(double) classes[i][0]/classes[i][1];
            a[i]=((double) classes[i][0])/((double) classes[i][1]);

        }

        while (extraStudents!=0){
            double mingai=2;
            int pos=0;
            for (int i = 0; i <a.length ; i++) {
                if (a[i]<mingai){
                    mingai=a[i];
                    pos=i;
                }
            }
            classes[pos][0]=classes[pos][0]+1;
            classes[pos][1]=classes[pos][1]+1;

//            a[pos]=(double)classes[pos][0]/classes[pos][1];
            a[pos]=((double) classes[pos][0])/((double) classes[pos][1]);

            extraStudents--;
        }

        double res=0;
        for (int i = 0; i < a.length; i++) {
           res=res+a[i];
        }
        return res/a.length;
    }
}