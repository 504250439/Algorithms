import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[][] m=new int[2][2];
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println(m[i][j]);
            }
        }
    }


        public static int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int res = 0;
        int max=0;
        int cishu=0;
        int[] meici = new int[customers.length];
        int shen = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] < 4) {
                if (customers[i] + shen >= 4) {
                    meici[i] = 4;
                    shen -= (4 - customers[i]);
                } else {
                    meici[i] = customers[i] + shen;
                    shen = 0;
                }
            } else {
                meici[i]=4;
                shen = shen+(customers[i] - 4);
            }
        }

            for (int i = 0; i <customers.length ; i++) {
                System.out.println(meici[i]);
            }
        System.out.println(shen);


        int cur = 0;
        int wanlr = 0;
        for (int i = 0; i < meici.length; i++) {
            cishu+=1;
            wanlr += meici[i];
            cur = wanlr * boardingCost - (i + 1) * runningCost;
            if (cur > max) {
                max = cur;
                res=cishu;
            }
            System.out.println(cishu);

        }
        int yirunningtime = meici.length + 1;

        while (shen >= 4) {
            cishu+=1;
            wanlr += 4;
            cur = wanlr * boardingCost - (yirunningtime) * runningCost;
            if (cur > max) {
                max = cur;
                res=cishu;
            }
            shen -= 4;
            yirunningtime++;
            System.out.println(cishu);

        }
        if (shen > 0) {
            wanlr += shen;
            cur = wanlr * boardingCost - (yirunningtime) * runningCost;
            if (cur > max) {
                max = cur;
                res+=1;
            }
            shen -= 4;

        }


        if (max > 0) {
            return res;
        } else {
            return -1;
        }
    }
}
    class ThroneInheritance {
        List<String> list=new ArrayList<>();
        HashSet<String> deathman=new HashSet<>();
        HashMap<String,Integer> erzishu=new HashMap<>();

        public ThroneInheritance(String kingName) {
            list.add(kingName);
        }

        public void birth(String parentName, String childName) {
            int weizhi=erzishu.getOrDefault(parentName,1);
            int fuqinweizhi=list.indexOf(parentName);
            if (weizhi!=1){
                int cur=0;
                for (int i = 0; i <weizhi-1 ; i++) {
                    cur+=erzishu.getOrDefault(list.indexOf(fuqinweizhi+i),0);
                }
                weizhi=cur;
            }
            list.add(fuqinweizhi+weizhi,childName);
            erzishu.put(parentName,weizhi+1);
        }

        public void death(String name) {
            deathman.add(name);
        }

        public List<String> getInheritanceOrder() {
            List<String> res=new ArrayList<>(list);
            for(String deaman:deathman){
                res.remove(deaman);
            }
            return res;
        }
    }

