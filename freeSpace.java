import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static java.time.temporal.ChronoUnit.SECONDS;


public class FreeSpace {
    public static void main(String[] args) throws InterruptedException {

        int taken[] = {14,2,3,5,7,10};

        boolean check[] = new boolean[taken[0]+1];

        for (int i = 0; i < check.length; i++ ){
            check[i] = true;
        }
        check[0] = false;

        for (int i = 1; i < taken.length; i++ ){
            check[taken[i]] = false;
        }

        long start = System.nanoTime();
        List<Integer> free = new ArrayList<>();
        for (int i = 1; i < check.length; i++){
            if( check[i] == true){
                free.add(i);
            }
        }

        System.out.print("Zajęte: ");
        for (int temp: taken) {
            System.out.print(temp + " ");
        }

        System.out.print("\nWolne: ");
        for (int temp:free) {
            System.out.print(temp +" ");
        }

        System.out.print("\n");

        int sum = 0;
        for (int i = 0; i < free.size(); i++){
                if (i == free.size()-1){
                    break;
                }
                if (free.get(i+1) - free.get(i) == 1 ||
                free.get(i+1) - free.get(i) == 2){
                         sum++;
                }
        }
        System.out.println("Liczba kombinacji: " + sum);
        long stop = System.nanoTime();
        System.out.println((stop-start)/100000);

    }
}
