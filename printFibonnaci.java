package fdsaf;

import java.util.Scanner;

public class dld {
    private int dupa;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(drawFibonacci(i) + " ");
        }

    }

    private static int drawFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return drawFibonacci(n - 1) + drawFibonacci(n - 2);
    }
}
