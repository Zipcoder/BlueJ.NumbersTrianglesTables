


public class NumberUtilities {

    public static String getRange(int stop) {
        String numList = "";
        for (int x = 0; x < stop; x++){
            numList = numList + Integer.toString(x);
        }
        return numList;
    }

    public static String getRange(int start, int stop) {
        String numList = "";
        for (int x = start; x < stop; x++){
            numList = numList + Integer.toString(x);
        }
        return numList;
    }


    public static String getRange(int start, int stop, int step) {
        String numList = "";
        for (int x = start; x < stop; x++){
            if (x % step == 0)
            numList = numList + Integer.toString(x);
        }
        return numList;
    }

    public static String getEvenNumbers(int start, int stop) {
        String numList = "";
        for (int x = start; x < stop; x++){
            if (x % 2 == 0)
            numList = numList + Integer.toString(x);
        }
        return numList;
    }


    public static String getOddNumbers(int start, int stop) {
        String numList = "";
        for (int x = start; x < stop; x++){
            if (x % 2 != 0)
            numList = numList + Integer.toString(x);
        }
        return numList;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String numList = "";
            for (int x = start; x <= stop; x++){
                
                int square = (int) Math.pow (x,exponent);
                numList = numList + square;
        }
        return numList;
    }
}
