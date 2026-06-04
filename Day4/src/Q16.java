import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        for (int i = lower; i <= upper; i++) {
            int originalNum = i;
            int temp = i;
            int digits = 0;
            int sum = 0;
            while (temp != 0) {
                digits++;
                temp = temp / 10;
            }
            temp = i;
            while (temp != 0) {
                int remainder = temp % 10;

                int power = 1;
                for (int j = 1; j <= digits; j++) {
                    power = power * remainder;
                }
                sum = sum + power;
                temp = temp / 10;
            }
            if (sum == originalNum) {
                System.out.print(i + " ");
            }
        }
    }
}