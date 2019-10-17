
public class NumberUtilities {
    public static String getRange(int stop) {
        String result = "";
        for(int i = 0; i < stop; i++) {
            result = result + Integer.toString(i);
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++) {
            result = result + Integer.toString(i);
        }
        return result;
    }

    public static String getRange(int start, int stop, int step) {
        String result = "";
        for(int i = start; i < stop; i++) {
            if (i % step == 0) {
                result = result + Integer.toString(i);
            }
        }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                result = result + Integer.toString(i);
            }
        }
        return result;
    }

    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++) {
            if (i % 2 == 1) {
                result = result + Integer.toString(i);
            }
        }
        return result;
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
        for(int i = start; i <= stop; i++) {
            int num = (int) Math.pow(i, exponent);
            result = result + Integer.toString(num);
        }
        return result;
    }
}
