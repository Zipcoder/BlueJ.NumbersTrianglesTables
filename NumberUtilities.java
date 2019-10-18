


public class NumberUtilities {

    public static String getRange(int stop) {
        String rangeCount = "";
        for (int i = 0; i < stop; i ++){
            rangeCount += i;
        }
        return rangeCount;
    }

    public static String getRange(int start, int stop) {
        String rangeCount = "";
        for (int i = start; i < stop; i++){
            rangeCount += i;
        }
        return rangeCount;
    }


    public static String getRange(int start, int stop, int step) {
        String rangeCount = "";
        for (int i = start; i < stop; i += step){
            rangeCount += i;
        }    
        return rangeCount;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenNumbersCount = "";
        for (int i = start; i < stop; i ++){
            if (i % 2 == 0){
            evenNumbersCount += i;
   }
}
        return evenNumbersCount;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumber = "";
        for (int i = start; i < stop; i ++){
        if (i % 2 != 0) 
        oddNumber += i;
        }
        return oddNumber;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String expoNum = "";
        int cubed;
        for (int i = start; i <= stop; i ++){
            cubed=(int)Math.pow(i,exponent);
            expoNum += cubed;
    }
        return expoNum;
    }
}
