import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args){
        List<Integer> subList = new ArrayList<>();
        subList.add(1);
        subList.add(3);
        subList.add(4);
        subList.add(5);
        Collections.reverse(subList);
        System.out.println(subList);
    }


}
//teste