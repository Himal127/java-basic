package todo2;
import java.util.Scanner;
public class CARNO {
    public static void main(String[] args) {
        int n,a,b,c,d,e;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Car No.:");
        n = scan.nextInt();
        if(n>999){
            a = n%10;
            n = n /10;
            b = n%10;
            n = n/10;
            c = n%10;
            d = n/10;
            e = a+b+c+d;
            if(e%3 == 0 || e%5 == 0 || e%7 ==0)
                System.out.println("Lucky Number");
            else
                System.out.println("no. is not lucky");
        }
        else
            System.out.println("invalid no.");



    }
}
