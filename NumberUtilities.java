


public class NumberUtilities {

    public static String result = "";
    
    public static String getRange(int stop) {
        for(int i = 0; i < stop; i++) {
            result = result + Integer.toString(i);
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        for(int i = 0; start < stop; i++) {
            result = result + Integer.toString(start);
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }

    public static String getEvenNumbers(int start, int stop) {
        return null;
    }


    public static String getOddNumbers(int start, int stop) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        return null;
    }
}
