package While;
import java.util.Scanner;
public class eg2 {
    public static void main(String[] args) {
        int num,count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        num = scan.nextInt();  //1234

        while(num > 0)
        {
            num = num / 10;
            count++;
        }

        System.out.println("it is " + count + " digit number");

    }
}
