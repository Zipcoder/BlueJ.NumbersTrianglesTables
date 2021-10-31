public class NumberUtilities {

    public static String getRange(int stop) {
        String outcome = "";
        String convert;

        for (int i = 0; i < stop; i++) {
            convert = Integer.toString(i);
            outcome += convert;
        }
        
        return outcome;
    }

    public static String getRange(int start, int stop) {
        String outcome = "";
        String convert;

        for (int i = start; i < stop; i++) {
            convert = Integer.toString(i);
            outcome += convert;
        }
        
        return outcome;
    }


    public static String getRange(int start, int stop, int step) {
        String outcome = "";
        String convert;

        for (int i = start; i < stop;) {
            convert = Integer.toString(i);
            outcome += convert;
            i += step;
        }
        
        return outcome;
    }

    public static String getEvenNumbers(int start, int stop) {
        String outcome = "";
        String convert;

        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                convert = Integer.toString(i);
                outcome += convert;
            }
        }
        
        return outcome;
    }


    public static String getOddNumbers(int start, int stop) {
        String outcome = "";
        String convert;

        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                convert = Integer.toString(i);
                outcome += convert;
            }
        }
        
        return outcome;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String outcome = "";
        String convert;
        int exponentials;

        for (int i = start; i <= stop; i++) {
            exponentials = (int)Math.pow(i, exponent);
            convert = Integer.toString(exponentials);
            outcome += convert;
        }
        
        return outcome;
    }
}