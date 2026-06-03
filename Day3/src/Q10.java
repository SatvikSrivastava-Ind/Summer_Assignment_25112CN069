import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        for (int i = lower; i <= upper; i++) {
            if (i > 1) {
                int isPrime = 1;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = 0;
                        break;
                    }
                }
                if (isPrime == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}