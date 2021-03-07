public class BruttoNetto {
    public static void  main(String[] args) {

        float netPrice = 451;
        int taxRate = 20;
        float taxApplied = (netPrice * taxRate)/100;
        float result = netPrice + taxApplied;
        System.out.println("GROSS-NET PRICE CALCULATOR");
        System.out.println("The price is: €" +netPrice+ ".- The tax (" +taxRate+ "%) is: €" +taxApplied+ ".-");
        System.out.println("Total price is €" + result+ ".-");

    }

}
