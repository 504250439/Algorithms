

import java.util.*;

//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }

public class test {
    public static void main(String[] args) {
    }
}





//class Solution {
//    public static List<String> alertNames(String[] keyName, String[] keyTime) {
//        List<String> res=new ArrayList<>();
//
//        List<List<Integer>> alllist=new ArrayList<>();
//        HashMap<String,List<Integer>> map=new HashMap<>();
//
//        for (int i = 0; i <keyName.length ; i++) {
//            if (map.containsKey(keyName[i])){
//                map.get(keyName[i]).add(chilitime(keyTime[i]));
//            }else{
//                List<Integer> path=new ArrayList<>();
//                path.add(chilitime(keyTime[i]));
//                map.put(keyName[i],new ArrayList<>(path));
//            }
////            System.out.println(keyName[i]+" "+chilitime(keyTime[i]));
//
//        }
//
//        for(String key:map.keySet()){
//            List<Integer> path=map.get(key);
//            if (path.size()>2){
//                Collections.sort(path);
//                for (int i = 0; i <path.size()-2; i++) {
//                    if (path.get(i+2)-path.get(i)<=3600 && path.get(i+2)-path.get(i)>=0){
//                        res.add(key);
//                        break;
//                    }
//                }
//            }
//        }
//        String[] strs1=res.toArray(new String[res.size()]);
//        Arrays.sort(strs1);
//        res= Arrays.asList(strs1);
//        return res;
//    }
//
//    public static int chilitime(String time){
//        int xiao=0;
//        int fen=0;
//        String xiaoshi;
//        String fenzhon;
//        if (time.charAt(0)!=0){
//            xiaoshi=time.substring(0,2);
//            xiao = Integer.parseInt( xiaoshi );
//        }else{
//            xiaoshi=time.substring(1,2);
//            xiao = Integer.parseInt( xiaoshi );
//        }
//        if (time.charAt(3)!=0){
//            fenzhon=time.substring(3,5);
//            fen=Integer.parseInt(fenzhon);
//        }else{
//            fenzhon=time.substring(4,5);
//            fen=Integer.parseInt(fenzhon);
//        }
//        return xiao*3600+fen*60;
//    }
//
//}



//class Solution {
//    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
//        int[][] res=new int[rowSum.length][colSum.length];
//
//        for (int i = 0; i <rowSum.length ; i++) {
//            for (int j = 0; j <colSum.length ; j++) {
//                res[i][j]= Math.min(rowSum[i],colSum[j]);
//                if (res[i][j]!=0){
//                    rowSum[i]=rowSum[i]-res[i][j];
//                    colSum[j]=colSum[j]-res[i][j];
//                }
//            }
//        }
//        return res;
//    }
//}



class ParkingSystem {
    int big;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }

    public boolean addCar(int carType) {
        if (carType==1 && big>0){
            big=big-1;
        }else if (carType==2 && medium>0){
            medium=medium-1;
        }else if (carType==3 && small>0){
            small=small-1;
        }else{
            return false;
        }
        return true;
    }
}
