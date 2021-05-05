package codility;

import java.util.HashMap;
import java.util.Map;

public class CountDiv {
    public static void main(String[] args) {

    }

    public static int solution(int A, int B, int K) {
//        int sum = 0;
//        int diff = B - A + 1;
//        for (int i = A; i < diff; i++){
//            if (i % K == 0){
//                sum++;
//            }
//
//        }
//        return sum;
//    }
        int add = (A % K == 0) ? 1 : 0;
        return B / K - A / K + add;
    }
}
