package codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};
        for (int a: solution(tab, 4)) {
            System.out.print(a + " ");
        }
    }

    public static int[] solution(int[] A, int K){
        if (K == 0){
            return A;
        }
        int i = 0;
        int j = 1;
        int[] tab = new int[A.length];
        while(i < A.length){
            if(j == A.length){
                j = 0;
            }
            tab[j] = A[i];
            i++;
            j++;
        }
        return solution(tab, K - 1);
    }
}
