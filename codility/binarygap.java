package codility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class binarygap {
    public static void main(String[] args) {
        System.out.println(Solution(5));
        int x = 1, y = 1, z = 0;
        if (x == y | x < ++y) {
            z = x+y;
        }
        else{
            z = 1;
        }
        System.out.println(z);

    }

    public static int Solution(int N){
        String binary = Integer.toBinaryString(N);
        int max = 0;

        if (binary.substring(1, binary.length()).indexOf("1") == -1){
            return 0;
        }

        String[] arr = binary.split("1");

        if (arr.length == 0 ){
            return 0;
        }
        Arrays.sort(arr, Comparator.comparing(String::length).reversed());
        for (String str: arr) {
            System.out.println(str);
        }
        max = arr[0].length();
        return max;
    }
}
