public class DistanceDemo {
    public static void  main(String[] args) {
        int kilometerValue = 10;

        double miles = convertKilometerToMiles(kilometerValue);
        System.out.println(kilometerValue + "kilometers are " + miles + " miles." );

    }


    public static double  convertKilometerToMiles(int kilometer) {
     double kilo = kilometer / 1.609;
     return kilo;

    }



}
