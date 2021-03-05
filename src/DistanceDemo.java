public class DistanceDemo {
    public static void  main(String[] args) {
        int kilometerValue = 10;

        double miles = kilometerToMiles(kilometerValue);
        System.out.println(kilometerValue + "kilometers are " + miles + " miles." );

    }


    public static double  kilometerToMiles(int kilometer) {
     double kilo = kilometer / 1.609;
     return kilo;
    }



}
