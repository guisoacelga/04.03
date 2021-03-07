public class BruttoNettoMaxRate {


        public static void  main(String[] args) {

            float netPrice = 451;
            int taxRate = 20;
            float taxApplied = (netPrice * taxRate)/100;
            float result = netPrice + taxApplied;
            float maxTax = 50;

            System.out.println("GROSS-NET PRICE CALCULATOR");
            System.out.println("The price is: €" +netPrice+ ".-");
            System.out.println("The tax (" +taxRate+ "%) is: €" +taxApplied+ ".-");
            if (taxApplied <= maxTax) {
                System.out.println("Total price is €" + result+ ".-");
            }
            else {
                System.out.println("WARNING: Tax exceeds the maximal amount.");
            }

        }

}
