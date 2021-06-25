


public class NumberUtilities {

    public static String getRange(int stop) {
        String res = "";
        for(int i = 0; i < stop; i++){
            res += i;
        }
        return res;
    }

    public static String getRange(int start, int stop) {
        String res = "";
        for(int i = start; i < stop; i++){
            res += i;
        }
        return res;
    }


    public static String getRange(int start, int stop, int step) {
        String res = "";
        for(int i = start; i < stop; i += step){
            res += i;
        }
        return res;
    }

    public static String getEvenNumbers(int start, int stop) {
        String res = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                res += i;
            }
        }
        return res;
    }


    public static String getOddNumbers(int start, int stop) {
        String res = "";
        for(int i = start; i < stop; i++){
            if(i % 2 != 0){
                res += i;
            }
        }
        return res;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String res = "";
        int calculatedValue;
        for(int i = start; i <= stop; i++){
            calculatedValue = i;
            for(int j = 1; j < exponent; j++){
                calculatedValue *= i;
            }
            res += calculatedValue;
        }
        return res;
    }
}
