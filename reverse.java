package While;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int a,b,c=0,d,e;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        a = scanner.nextInt();
        while(a!=0){
            b = a%10;
            c = c*10 +b;
            a = a/10;
        }
        System.out.println(c);




    }
}
