public class StringDemo {
    public static void main(String[] args) {

        char c = 'A';
        String demo = "Heute ist Freitag.";

        System.out.println(demo);
        //prints out the String

        System.out.println("demo.length() = " + demo.length());
        // returns the length of the String

        System.out.println("demo.charAt(0) = " + demo.charAt(0));
        // Returns a character at the index position, !!important position starts at 0

        System.out.println("demo.charAt(7) = " + demo.charAt(7));
        // Returns a character at the index position, !!important position starts at 0

        System.out.println("demo.contains(\"Frei\") = " + demo.contains("Frei"));
        // checks if the String contains "frei" returns ****true**** bc it is case sensitive
        // the \" is to be able to print the quotation marks

        System.out.println("demo.contains(\"frei\") = " + demo.contains("frei"));
        // checks if the String contains "frei" returns ****false**** bc it is case sensitive

        System.out.println("demo.contains(\"Hallo\") = " + demo.contains("Hallo"));
        // checks if the String contains "Hallo" returns ****false**** bc it does not

        System.out.println("demo.toLowerCase() = " + demo.toLowerCase());
        // returns the String in lower case

        System.out.println("demo.toUpperCase() = " + demo.toUpperCase());
        // returns the String in upper case

        System.out.println("containsIgnoreCase(demo, \"frei\") = " + containsIgnoreCase(demo, "frei"));
        // returns wether the String contains "frei", but it is not case sensitive

        String demo2 = "Heute ist Freitag.";

        if (demo.equalsIgnoreCase(demo2)) {
            // Bei if-Abfragen, bei Strings, IMMER .equals() verwenden
            // ALWAYS use .equals() in if-questions with Strings****** NOT SURE ABOUT THIS TRANSLATION
            System.out.println("demo entspricht demo2");
        }
    }

    public static boolean containsIgnoreCase(String source, String search){
        String sourceLowerCase = source.toLowerCase();
        String searchLowerCase = search.toLowerCase();

        return sourceLowerCase.contains(searchLowerCase);
    }
}
