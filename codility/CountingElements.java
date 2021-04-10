package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingElements {
    public static void main(String[] args) {
        int [] N = {3, 4, 4, 6, 1, 4, 4};
        N = solution2(5, N);
        for (int i:N) {
            System.out.print(i + ", ");
        }
    }

    public static int[] solution(int N, int[] A) {
        int[] arr = new int[N];
        int max = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] <= arr.length && A[i] >= 1) {
                int index = A[i] - 1;
                arr[index]++;
                if (max < arr[index]) {
                    max = arr[index];
                }
            }

            if (A[i] == arr.length + 1) {
                setMax(arr, max);
            }
        }
            return arr;
    }

    public static void setMax(int[] N, int max){
        for (int i = 0; i < N.length; i++) {
            if (N[i] <  max){
                N[i] = max;
            }
        }
    }

    public static int[] solution2(int N, int[] A){
        int[] counters = new int[N];
        int max = 0;
        int update = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == N + 1){
                update = max;
            }

            else {
                    int index = A[i] - 1;

                    if (counters[index] < update){
                        counters[index] = update + 1;
                    }

                    else {
                        counters[index]++;
                    }

                    if (counters[index] > max){
                        max = counters[index];
                    }
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < update){
                counters[i] = update;
            }
        }
        return counters;
    }
}
