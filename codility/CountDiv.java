package codility;

import java.util.HashMap;
import java.util.Map;

public class CountDiv {
    public static void main(String[] args) {
        Map<Integer, String> items = new HashMap<>();
        items.put(Integer.valueOf(1),"Tea");
        items.put(Integer.valueOf(2),"Cake");
        items.put(Integer.valueOf(1),"Coffee");
        items.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public static int solution(int A, int B, int K) {
//        int sum = 0;
//        int diff = B - A + 1;
//        for (int i = 0; i < diff; i++){
//            if (A % K == 0){
//                sum++;
//            }
//            A++;
//        }
//        return sum;
//    }
        int add = (A % K == 0) ? 1 : 0;
        return B / K - A / K + add;
    }
}
