package Converter;

public class fahrentToCelsius {
    private static double celsius;


    public static void main(String[] args) {
        farhToCel(1);
    }

    public static double farhToCel(double i) {

        String strOut = null;
        
        celsius = ((i-32)*5)/9;

       String cel = String.valueOf(celsius);


        if (cel.contains("-")){
            strOut = cel.substring(0, 6);
        }
       else {
            strOut = cel.substring(0, 5);
       }

        double result = Double.parseDouble(strOut);
        
        System.out.println(strOut);
        return result;
    }
}
