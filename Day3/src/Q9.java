import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int isPrime = 1;
        if (num <= 1) {
            isPrime = 0;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }
        if (isPrime == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}