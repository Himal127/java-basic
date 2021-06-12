package todo1;
import java.util.Scanner;
public class posneg0 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        n = scanner.nextInt();
        if(n > 0)
            System.out.println("positive");
        else if(n<0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}
