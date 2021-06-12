package While;
import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        int a,b,s = 0,m = 1,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        a = scanner.nextInt();
        while(a != 0){
            b = a % 10;
            s += b;
            m *= b;
            a = a/10;

        }
        if(s == m)
            System.out.println("it is spy number");
        else
            System.out.println("it is not spy");

    }
}
