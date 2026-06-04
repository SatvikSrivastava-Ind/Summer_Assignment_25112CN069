import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int temp = num;
        int digits = 0;
        int sum = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * remainder;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == originalNum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}