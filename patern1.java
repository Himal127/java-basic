package conditionallooping;

public class patern1 {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++)   // rows
        {
            for (int j = 5; j >=i ; j--) //col
            {
                System.out.print("* ");
            }

            System.out.println();

        }


    }
}
