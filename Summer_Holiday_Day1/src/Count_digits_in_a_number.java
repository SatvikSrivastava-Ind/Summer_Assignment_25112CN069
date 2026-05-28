import java.util.Scanner;
public class Count_digits_in_a_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive integer");
        int n= scanner.nextInt();
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println("The number of digits is: " + count);

        scanner.close();
    }
}
