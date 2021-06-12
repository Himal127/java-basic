package todo2;
import java.util.Scanner;

public class Placement {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of students placed in CSE :");
        a = scanner.nextInt();
        System.out.println("Enter no of students placed in MECH :");
        b = scanner.nextInt();
        System.out.println("Enter no of students placed in  ESE:");
        c= scanner.nextInt();
        if(a>0 && b>0 && c>0) {
            if (a > b && a > c)
                System.out.println("CSE");
            else if (b > c && b > a)
                System.out.println("MECH");
            else if (c > a && c > b)
                System.out.println("ESE");
            else if (a == b && b == c)
                System.out.println("none of branch");
            else if (a == b)
                System.out.println("CSE and MECH");
            else if (b == c)
                System.out.println("MECH and ESE");
            else if (a == c)
                System.out.println("CSE and ESE");
            System.out.println("got highest placement");

        }
        else
            System.out.println("invalid number entered");

    }
}
