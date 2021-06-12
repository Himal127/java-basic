package todo2;
import java.util.Scanner;

public class Salarytax {
    public static void main(String[] args) {
        int s,t;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Salary of Employee");
        s = scanner.nextInt();
        if(s<150000)
            t = 0;
        else if(s<300000)
            t = (s*10)/100;
        else if(s<500000)
            t = (s*20)/100;
        else
            t = (s*30)/100;

        System.out.println("Tax you have to pay:"+t);



    }
}
