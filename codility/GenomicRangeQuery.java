package codility;

import java.util.Arrays;
import java.util.stream.Stream;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        String S = "TC";
        int[] P = {0,0,1};
        int[] Q = {0,1,1};
        Arrays.stream(solution2(S, P, Q)).forEach(System.out::println);
    }

    public static int[] solution(String S, int[] P, int[] Q){

        int[] minFactors = new int[P.length];
        String search;
        for (int i = 0; i < P.length; i++) {
            search = S.substring(P[i], Q[i]+1);
            if (search.indexOf('A')!=-1){
                    minFactors[i] = 1;
            }
            else if (search.indexOf('C') != -1){
                    minFactors[i] = 2;
            }
            else if (search.indexOf('G') != -1){
                    minFactors[i] = 3;
            }
            else {
                    minFactors[i] = 4;
            }
        }
        return minFactors;
    }
    /////FASTER
    public static int[] solution2(String S, int[] P, int[] Q){

        int[][] nucleothidesPrefix = new int[3][S.length()+1];
        short a, c ,g;

        for (int i = 0; i < S.length(); i++) {
            a = 0; c = 0; g = 0;
            if (S.charAt(i) == 'A'){
                a = 1;
            }
            else if (S.charAt(i) == 'C'){
                c = 1;
            }
            else if (S.charAt(i) == 'G'){
                g = 1;
            }

            nucleothidesPrefix[0][i+1] = nucleothidesPrefix[0][i] + a;
            nucleothidesPrefix[1][i+1] = nucleothidesPrefix[1][i] + c;
            nucleothidesPrefix[2][i+1] = nucleothidesPrefix[2][i] + g;

        }

        int [] minFactors = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int startIndex = P[i];
            int endIndex = Q[i] + 1;

            if( nucleothidesPrefix[0][endIndex] - nucleothidesPrefix[0][startIndex] > 0){
                minFactors[i] = 1;
            }
            else if( nucleothidesPrefix[1][endIndex] - nucleothidesPrefix[1][startIndex] > 0){
                minFactors[i] = 2;
            }
            else if( nucleothidesPrefix[2][endIndex] - nucleothidesPrefix[2][startIndex] > 0){
                minFactors[i] = 3;
            }
            else {
                minFactors[i] = 4;
            }
        }
        return minFactors;
    }
}
