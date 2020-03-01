


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0,stop,1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start,stop,1);
    }


    public static String getRange(int start, int stop, int step) {
        String response = "";
        
        for (int i = start; i < stop; i+= step) {
            response += Integer.toString(i);
        }
        return response;
    }

    public static String getEvenNumbers(int start, int stop) {
        if (start%2 == 1){ // even this number up
            start = start + 1;
        }
        if (stop%2 == 1){ // even this number down
            stop = stop + 1;
        }
        return getRange(start,stop,2);
    }


    public static String getOddNumbers(int start, int stop) {
        if (start%2 == 0){ // odd this number up
            start = start + 1;
        }
        if (stop%2 == 0){ // odd this number down
            stop = stop + 1;
        }
        return getRange(start,stop,2);
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String response = "";
        
        for (int i = start; i <= stop; i++) {
            response += Integer.toString((int) Math.pow(i,exponent));
        }
        return response;
    }
}
