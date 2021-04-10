package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] tab = {3, 1, 2, 4, 3};
        System.out.println(solution(tab));
    }

    public static int solution(int[] A) {
        int P = 1;
        int diffMin = 100000;
        int totalSum = 0;
        int sumL = 0;
        int sumP = 0;
        int diff = 0;
        for (int i = 0; i < A.length; i++){
            totalSum += A[i];
        }
        do{
                sumL = A[P - 1] + sumL;
                sumP = totalSum - sumL;
                diff = Math.abs(sumL - sumP);

                if (diff == 0){
                    return 0;
                }

                if (P == 1 || diffMin > diff){
                diffMin = diff;
            }

            P++;
        }while (P < A.length);
        return diffMin;
    }
}
