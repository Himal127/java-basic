package conditionallooping;

public class pattern3 {
    public static void main(String[] args) {
        int k=1;

        for (int i = 1; i <=5 ; i++)   // rows
        {
            for (int j = 1; j <=i ; j++) //col
            {
                System.out.print(k++ +" ");
            }

            System.out.println();

        }


    }
}
