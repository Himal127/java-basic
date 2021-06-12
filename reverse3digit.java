package todo1;

import java.util.Scanner;

public class reverse3digit {
    public static void main(String[] args) {
        int n1,n2,a,b,c;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter three digit number");
        n1 = scanner.nextInt();
        a = n1 % 10;
        n1 = n1 / 10;
        b = n1 % 10;
        c = n1 / 10;
        n2 = (a*100) + (b*10) + c;
        System.out.println("Reverse of no is:");
        System.out.println(n2);

    }


}
