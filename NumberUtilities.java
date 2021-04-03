


public class NumberUtilities {

    public static String getRange(int stop) {
        String placeHolder = "";
        int[] intArr = new int[stop];
        for (int i = 0; i < stop; i++) {
            intArr[i] = i;
            String intStr = Integer.toString(intArr[i]);
            placeHolder += intStr;
        }
        return  placeHolder;
    }
   

    public static String getRange(int start, int stop) {
        String placeHolder = "";
        int[] intArr = new int[stop];
        for (int i = start; i < stop; i++) {
            intArr[i] = i;
            String intStr = Integer.toString(intArr[i]);
            placeHolder += intStr;
        }
        return  placeHolder;
    }


    public static String getRange(int start, int stop, int step) {
        String placeHolder = "";
        int[] intArr = new int[stop];
        for (int i = start; i < stop; i += step) {
            intArr[i] = i;
            String intStr = Integer.toString(intArr[i]);
            placeHolder += intStr;
        }
        return  placeHolder;
    }

    public static String getEvenNumbers(int start, int stop) {
        String placeHolder = "";
        int[] intArr = new int[stop];
        if (start % 2 == 1) {
            start += 1;
        }
        for (int i = start; i < stop; i += 2) {
                intArr[i] = i;
                String intStr = Integer.toString(intArr[i]);
                placeHolder += intStr;
            }
        return placeHolder;
    }


    public static String getOddNumbers(int start, int stop) {
        String placeHolder = "";
        int[] intArr = new int[stop];
        if (start % 2 == 0) {
            start += 1;
        }
        for (int i = start; i < stop; i += 2) {
                intArr[i] = i;
                String intStr = Integer.toString(intArr[i]);
                placeHolder += intStr;
            }
        return placeHolder;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String placeHolder = "";
        int[] intArr = new int[stop];
        int intInt = start;
        double intDbl = intInt;
        for (int i = 0; i <= stop - start; i++) {
            intArr[i] = (int) Math.pow(intDbl, exponent);
            String intStr = Integer.toString(intArr[i]);
            placeHolder += intStr;
            intDbl++;
        }
        return placeHolder;
    }
}
