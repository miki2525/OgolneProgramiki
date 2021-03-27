import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        do {
            n = in.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = n; j > i; j--) {

                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int numOfSpaces = i;
            int numOfStars = n - i;
            for (int j = 0; j < numOfSpaces; j++) {

                System.out.print(" ");
            }
            for (int j = 0; j < numOfStars; j++) {
                System.out.print("*");
            }


            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            int numOfSpaces = n - i - 1;
            int numOfStars = i + 1;
            for (int j = numOfSpaces; j > 0; j--) {

                System.out.print(" ");
            }
            for (int j = 0; j < numOfStars; j++) {
                System.out.print("*");
            }


            System.out.println();


        }
    }
}