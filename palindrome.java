package While;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int a,b,c=0,d = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        a = scanner.nextInt();
        while(a!=0) {
            b = a % 10;
            c = c * 10 + b;
            a = a / 10;
            c = d;
        }
        if(d == a)
            System.out.println("No is palindrome");
        else
            System.out.println("No is not palindrome");
    }
}
