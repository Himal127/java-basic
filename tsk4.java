package conditionallooping;

import java.util.Scanner;

public class tsk4 {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Range");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
