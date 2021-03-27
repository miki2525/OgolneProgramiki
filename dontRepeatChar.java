
import java.io.*;
import java.util.*;

class zad10 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String zdanie = sc.nextLine();
        int index = 0;
        boolean alfabet[] = new boolean[26];
        char tab[] = new char[zdanie.length()];

        tab = zdanie.toCharArray();

        for (int i = 0; i < zdanie.length(); i++) {
            if (tab[i] >= 'A' && tab[i] <= 'Z') {
                index = tab[i] - 'A';
            } else if (tab[i] >= 'a' && tab[i] <= 'z') {
                index = tab[i] - 'a';
            }

            alfabet[index] = true;
        }
        for (int i = 0; i < alfabet.length; i++) {
            if (alfabet[i] == false) {

                System.out.print("false");
                return;
            }
        }
        System.out.print("true");
        return;
    }
}