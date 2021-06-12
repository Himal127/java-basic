package todo2;
import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter user name");
        String a = scanner.next();
        System.out.println("Welcome "+a);
    }
}
