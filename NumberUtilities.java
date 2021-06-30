

    
public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        return start % 2 == 1 ?
                getRange(++start, stop, 2) :
                getRange(start, stop, 2);
    }

    public static String getOddNumbers(int start, int stop) {
        return start % 2 == 0 ?
                getRange(++start, stop, 2) :
                getRange(start, stop, 2);
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);

    }

    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        int currentNumber = start;
        StringBuilder range = new StringBuilder();
        while (currentNumber < stop) {
            range.append((int) Math.pow(currentNumber, exponent));
            currentNumber += step;
        }
        return range.toString();
    }
}

