package todo2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome \nRs 100/pizza\nRs 20/puffs\nRs 10/coldrink");
        System.out.println("Enter number of pizza");
        a = scanner.nextInt();
        System.out.println("Enter number of puffs");
        b = scanner.nextInt();
        System.out.println("Enter number of coldrinks");
        c = scanner.nextInt();
        d = (a*100) + (b*20) + (c*10);
        System.out.println("Bill Details\n no.of pizza:"+a+"\n no. of puffs:"+b+"\n no of coldrinks"+c);
        System.out.println("Total bill:"+d+"\n ENJOY THE SHOW!!!");
    }
}
