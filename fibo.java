package conditionallooping;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        n = scanner.nextInt();
        System.out.print(n1 + " " + n2);
        for (int i = 2; i <= n; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
