package pack_add;
import java.util.Scanner;

public class Adduser {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value of n1");

        n1 = scanner.nextInt();
        System.out.println("enter the value of n2");

        n2 = scanner.nextInt();
        n3 = n1+n2;
        System.out.println(n3);



    }

}
