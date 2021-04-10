package codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[]A = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A){
        if (X <= 0){
            return -1;
        }
        Set<Integer> leaves = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            leaves.add(A[i]);
            if(X == leaves.size()){
                return i;
            }
        }
        return -1;
    }
}
