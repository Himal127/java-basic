package todo1;
import java.util.Scanner;

public class multipleoperation {
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("what operation you want to perform\n1)addition\n2)substraction\n3)division\n4)multiplication");
        System.out.println("Enter your choice");
        c = scanner.nextInt();
        if(c == 1){
            d = a + b;
            System.out.println(d);

        }
        else if(c == 2){
            d = a - b;
            System.out.println(d);
        }
        else if(c == 3){
            d = a / b;
            System.out.println(d);
        }
        else if(c == 4){
            d = a * b;
            System.out.println(d);
        }
        else
            System.out.println("enter correct choice");



    }
}
