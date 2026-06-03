import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num1 = a;
        int num2 = b;
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int gcd = num1;
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }
}