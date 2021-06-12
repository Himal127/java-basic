package todo2;
import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the letter 1:");
        {if(scanner.next().charAt(0)!='R')
            count++;
            System.out.println("Enter the letter 2:");
            if(scanner.next().charAt(0)!='A')
                count++;
            System.out.println("Enter the letter 3:");
            if(scanner.next().charAt(0)!='I')
                count++;
            System.out.println("Enter the letter 4:");
            if(scanner.next().charAt(0)!='N')
                count++;
            System.out.println("Enter the letter 5:");
            if(scanner.next().charAt(0)!='B')
                count++;
            System.out.println("Enter the letter 6:");
            if(scanner.next().charAt(0)!='O')
                count++;
            System.out.println("Enter the letter 7:");
            if(scanner.next().charAt(0)!='W')
                count++;
        }

        if(count==0)
        {
            System.out.println("RAINBOW");
        }
        else
        {
            System.out.println("The spelling is wrong");
        }
    }
}
