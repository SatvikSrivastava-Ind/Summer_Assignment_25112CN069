import java.util.Scanner;
public class Print_multiplication_table_of_a_given_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to get its multiplication table:");
        int n= scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
        scanner.close();
    }
}
