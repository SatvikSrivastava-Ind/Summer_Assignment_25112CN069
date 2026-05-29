import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }

        System.out.println("The reverse of " + originalNum + " is: " + reversed);
    }
}