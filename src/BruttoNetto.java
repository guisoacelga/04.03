public class BruttoNetto {
    public static void  main(String[] args) {

        float netPrice = 400;
        int tax = 20;
        float tax1 = (netPrice * tax)/100;
        float result = netPrice + tax1;
        System.out.println("Total price is " + result);





    }

}
