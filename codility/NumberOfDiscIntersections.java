package codility;

public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        int[] A = {1,5,2,1,4,0};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        int N = A.length;
        int sum = 0;
        int xi1;
        int xi2;
        int xj1;
        int xj2;

        if( N <= 1){
            return 0;
        }

        for (int i = 0; i < N; i++) {
            xi1 = i - A[i];
            xi2 = i + A[i];

            for (int j = 0; j < N; j++) {

                if (j == i){
                    continue;
                }


                xj1 = j - A[j];
                xj2 = j + A[j];

                if (xi1 >= xj1 && xi1 <= xj2 ||
                xj1 >= xi1 && xj1 <= xi2){
                 sum++;
                }
            }
        }

        if (sum/2 > 10000000){
            return -1;
        }

        return sum/2;
    }
}
