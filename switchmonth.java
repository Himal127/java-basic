package todo2;
import java.util.Scanner;

public class switchmonth {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        n = scanner.nextInt();
        switch (n){
            case 1:{
                System.out.println("January");
                break;
            }
            case 2:{
                System.out.println("February");
                break;
            }
            case 3:{
                System.out.println("March");
                break;
            }
            case 4:{
                System.out.println("April");
                break;
            }
            case 5:{
                System.out.println("MAy");
                break;
            }
            case 6:{
                System.out.println("June");
                break;
            }
            case 7:{
                System.out.println("July");
                break;
            }
            case 8:{
                System.out.println("August");
                break;
            }
            case 9:{
                System.out.println("september");
                break;
            }
            case 10:{
                System.out.println("October");
                break;
            }
            case 11:{
                System.out.println("Novembver");
                break;
            }
            case 12:{
                System.out.println("December");
                break;
            }
            default:
                System.out.println("no month for no.:"+n);

        }


    }
}
