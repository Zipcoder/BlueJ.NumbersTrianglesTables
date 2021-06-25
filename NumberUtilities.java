
import java.lang.Math;

public class NumberUtilities {

    public static String getRange(int stop) {
        String x = "";
        for (int i = 0; i < stop; i++){
            x += i;
        }
        return x;
    }

    public static String getRange(int start, int stop) {
        String x = "";
        for (int i = start; i < stop; i++){
            x += i;
        }
        return x;
    }


    public static String getRange(int start, int stop, int step) {
        String x = "";
        int i = start;
        while (i < stop) {
            x += i;
            i += step;
        }
        return x;
    }

    public static String getEvenNumbers(int start, int stop) {
        String x = "";
        for (int i = start; i < stop; i++){
            if((i % 2) == 0){
                x += i;
            }
        }
        return x;
    }


    public static String getOddNumbers(int start, int stop) {
        String x = "";
        for (int i = start; i < stop; i++){
            if((i % 2) == 1){
                x += i;
            }
        }
        return x;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String x = "";
        for (int i = start; i <= stop; i++){
            int a = (int)Math.pow(i,exponent);
            x += a;
        }
        return x;
    }
}
