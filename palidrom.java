import java.util.*;

class zadanie5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String napis = sc.nextLine();

        char tab[] = new char [100];
        char tab2[] = new char [100];

        tab = napis.toCharArray();
        int rozmiar = tab.length;


        int i = 0;
        int j = tab.length - 1;

        while (i < tab.length / 2){

        if(tab[i] != tab[j]) {
            break;
        }
        i++;
        j--;
        }
        if (i < j){

            System.out.println("NIE");
        }
        else{
            System.out.println("TAK");
        }
        }
    }