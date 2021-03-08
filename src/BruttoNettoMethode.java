public class BruttoNettoMethode {

    public static void  main(String[] args) {

        float netPrice = 451;
        int taxClass = 3;
        int taxRate = 0;

        if (taxClass == 1) {
            taxRate = 20;
        } else if (taxClass == 2) {
            taxRate = 16;
        } else if (taxClass == 3) {
            taxRate = 8;
        }

        float taxApplied = (netPrice * taxRate)/100;
        //float result = netPrice + taxApplied;

        float maxTax = 50;

        System.out.println("GROSS-NET PRICE CALCULATOR");
        System.out.println("The price is: €" +netPrice+ ".-");
        System.out.println("The tax (" +taxRate+ "%) is: €" +taxApplied+ ".-");
        if (taxApplied <= maxTax) {
            System.out.println("Total price is €" + CalculateGrossPrice(netPrice, taxApplied)+ ".-");
        }
        else {
            System.out.println("WARNING: Tax exceeds the maximal amount.");
        }

    }

    public static float CalculateGrossPrice(float netPrice, float taxApplied) {

        float result = netPrice + taxApplied;
        return result;
    }
}
