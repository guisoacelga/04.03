public class FindFactorDemo {
    public static void main(String[] args) {

        findFactors(35);
        System.out.println("");
        findFactors(57);
        System.out.println("");
        findFactors(22);

    }

    public static void findFactors (int number) {

        System.out.print("Faktoren von " + number + ": ");

        int counter = 1;
        while (counter <= number) {
            // if (number == counter) {
            //     System.out.print(counter);
            // }
            if ((number % counter == 0) && (number!=counter) ) {
                System.out.print(counter + ", ");
            }
            else if ((number % counter == 0) && (number==counter))
            {
                System.out.print(counter + ".");
            }
            //System.out.println("");
            counter++;

        }
    }


}
