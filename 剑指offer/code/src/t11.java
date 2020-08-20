public class t11 {
}

//线性查找法
class Solution {
    public int minArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]<numbers[i-1]){
                return numbers[i];
            }
        }
        return numbers[0];

    }
}