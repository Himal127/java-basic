package todo2;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month");
        n = scanner.nextInt();
        switch (n){
            case 1:
            case 12:
            case 2: {
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Spring");
                System.out.println("spring");
                break;
            }
            case 6:
            case 8:
            case 7: {
                System.out.println("summer");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Autumn");
                break;
            }
            default:
                System.out.println("Invalid Month");

        }


    }
}


