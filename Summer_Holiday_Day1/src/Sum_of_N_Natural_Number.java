import java.util.Scanner;
public class Sum_of_N_Natural_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive integer");
        int n= scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        scanner.close();
    }
}
