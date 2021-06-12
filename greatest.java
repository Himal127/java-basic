package todo1;
import java.util.Scanner;

public class greatest
{
    public static void main(String[] args)
    {
        int n1,n2,n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three different numbers");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        if (n1 > n2 && n1 > n3)
            System.out.println(n1 + "is greatest no");
        else if(n2 > n1 && n2 > n3)
            System.out.println(n2 + "is greatest no" );
        else
            System.out.println(n3 + "is greatest no");

    }

}
