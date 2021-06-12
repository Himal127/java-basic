package While;
import java.util.Scanner;

public class pronic {
    public static void main(String[] args) {
        int a,b,c=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any no.");
        a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            if (i * (i + 1) == a) {
                c = 1;
                break;
            }
        }
        if (c == 1)
            System.out.println("no. is pronic");
        else
            System.out.println("not pronic");


    }
}
