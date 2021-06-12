package todo1;

import java.util.Scanner;


public class salary {
    public static void main(String[] args) {

        float ts,hra,da;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic salary");
        float bs = scanner.nextFloat();
        hra = (40 * bs)/100;
        da = (30 * bs)/100;
        ts = bs + hra + da;
        System.out.println("Total Salary:");
        System.out.println(ts);

    }
}
