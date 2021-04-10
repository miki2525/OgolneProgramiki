package codility;

public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int x, int y, int d){
        int distance = y - x;

        int jumps = distance / d;
        if (distance % d != 0){
            jumps++;
        }
        return jumps;
    }
}
