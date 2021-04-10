package codility;

import java.util.*;

public class PermMissingElem
{
    public static void main(String[] args) {
        int[] tab = {2,3,4,5,6};
        System.out.println(solution(tab));
    }

    public static int solution(int[] A){
        Arrays.sort(A);
        if (A.length > 0) {

        if(A.length == 1 && A[0] != 1) {
            return 1;
        }

        if(A.length == 1 && A[0] == 1) {
            return A[0] + 1;
        }

            for (int i = 0; i < A.length; i++) {
                if (A[0] != 1){
                    return 1;
                }
                if (i == A.length - 1) {
                    return A[i] + 1;
                }

                if (A[i] + 1 != A[i + 1]) {
                    return A[i] + 1;
                }

            }
        }
        return 1;
    }
}
