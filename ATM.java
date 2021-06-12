package todo2;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int b,c,a,d;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your balance");
        b = scanner.nextInt();
        System.out.println("what do you want to do:\n1)withdraw\n2)deposite");
        c = scanner.nextInt();
        if(c == 1){
            System.out.println("Enter amount you want to withdraw");
            a = scanner.nextInt();
            d = b - a;
            System.out.println("current balance is "+d);

        }
        else if(c == 2){
            System.out.println("Enter amount you want to deposite");
            a = scanner.nextInt();
            d = b + a;
            System.out.println("current balance is "+d);

        }
        else
            System.out.println("invalid choice");



    }
}
