package While;
import java.util.Scanner;
public class krishnamurthy {
    public static void main(String[] args) {
        int a, b = 1, i, c = 0, d, e, f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        a = scanner.nextInt();
        d = a;
        while (a != 0) {
            b = 1;
            i = a % 10;
            for (int j = 1; j <= i; j++) {
                b = b * j;
            }
            a = a /10;
            c = c + b;
        }
        if(c == d)
            System.out.println("It is Krishnamurthy no");
        else
            System.out.println("It is not krishnamurthy no.");

    }
}

