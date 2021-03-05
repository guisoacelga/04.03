import java.util.Scanner;

public class FindFactor3 {
    public static void main(String[] args) {

        int number = 1;
        Scanner reader = new Scanner(System.in);
        while (number != 0)
        {
            System.out.print("FACTORIZATION - (Enter 0 to exit)\nPlease enter a number (1-99):\n ");
            number = reader.nextInt();

            if (number != 0)
            {
                findFactors(number);
                System.out.println("");
            }

        }

    }

    public static void findFactors (int number) {

        System.out.print("Faktoren von " + number + ": ");

        int counter = 1;
        while (counter < number)
        {

            if (number % counter == 0)
            {
                System.out.print(counter + ", ");
            }

            counter++;

        }

        System.out.print(counter + ".");
    }

}
