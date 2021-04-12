package codility;

import java.util.Arrays;
import java.util.Comparator;

public class MissingInteger{

    public static void main(String[] args) {

                int[] A = {1,2,3,4,5,150,151,512};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) {
                min++;
            }
        }
        return min;
    }
}


/*
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.
 */
