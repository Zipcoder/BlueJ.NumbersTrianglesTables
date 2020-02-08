


public class NumberUtilities {

    public static String getRange(int stop) {
        String result = "";
        for (int i = 0; i < stop; i++) {
            result += i;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result2 = "";
        for (int i = start; i < stop; i++) {
            result2 += i;
        }
        return result2;
    }


    public static String getRange(int start, int stop, int step) {
       String result3 = "";
        for (int i = start; i < stop; i = i + step) {
            result3 += i;
        }
        return result3;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result4 = "";
        for (int i = start; i < stop; i++) {
            if(i % 2 == 0) {
            result4 += i;
        }
    }
        return result4;
    }
    
    public static String getOddNumbers(int start, int stop) {
        String result5 = "";
        for (int i = start; i < stop; i++) {
            if(i % 2 == 1) {
                result5 +=i;
            }
    }
return result5;
}
public static String getExponentiations(int start, int stop, int exponent) {
        String result6 = "";
        for (int i = start; i <= stop; i++)  {
            
            result6 +=(int)Math.pow(i, exponent);
    }
    return result6;
}
}
