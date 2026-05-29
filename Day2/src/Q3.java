import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println("The product of digits of " + originalNum + " is: " + product);
    }
}