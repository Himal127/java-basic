package todo1;
import java.util.Scanner;

public class Areaofrec {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        n1 = scanner.nextInt();
        System.out.println("enter breadth");
        n2 = scanner.nextInt();
        n3 = n2*n1;
        System.out.println("Area of rectangle is:");
        System.out.println(n3);



    }
}
