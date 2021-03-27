import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test {

    private int dupa;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int p = in.nextInt();

        System.out.println(powerMath(n, p));

    }

    private static int powerMath(int n, int p) {

        if( p == 0){
            return 1;
        }

        if( p == 1){
            return n;
        }

        return n * powerMath(n, p - 1);
    }
}

