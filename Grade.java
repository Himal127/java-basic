package todo2;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int a,b,c,d,e,avg;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of English");
        a = scanner.nextInt();
        System.out.println("Enter marks of MAth");
        b = scanner.nextInt();
        System.out.println("Enter marks of Science");
        c = scanner.nextInt();
        System.out.println("Enter marks of Marathi");
        d = scanner.nextInt();
        System.out.println("Enter marks of Hindi");
        e = scanner.nextInt();
        avg = (a+b+c+d+e)/5;
        System.out.println("Student got"+avg+"%");
        if(avg>80)
            System.out.println("Grade A");
        else if(avg>60)
            System.out.println("Grade B");
        else if(avg>40)
            System.out.println("Grade c");
        else
            System.out.println("padle beta abhi mauka hai!!!!");


    }
}
