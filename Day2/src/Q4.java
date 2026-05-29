import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }

        if (originalNum == reversed) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome number.");
        }
    }
}