import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.StringBuilder;

public class NumberUtilities {
/*
    public static String getRange(int stop) {
        String[] stringArr = new String[stop];

        for (int i = 0; i < stop; i++){
            stringArr[i] = Integer.toString(i);
        }

        String string = Arrays.toString(stringArr);   
        string = string.replaceAll(", ", "").replaceAll("\\[", "").replaceAll("\\]", "");
        return string;
    }
    */

    public static String getRange(int start, int stop) {
        String[] stringArr = new String[stop-start];

        for (int i = 0; i < stringArr.length; i++){
            stringArr[i] = Integer.toString(start + i);
        }

        String string = Arrays.toString(stringArr);   
        string = string.replaceAll(", ", "").replaceAll("\\[", "").replaceAll("\\]", "");
        return string;
    }

    public static String getRange(int start, int stop, int step) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start; i < stop; i += step) {
            arr.add(i);

        }

        String string = arr.toString();
        string = string.replaceAll(", ", "").replaceAll("\\[", "").replaceAll("\\]", "");
        return string;
    }

    public static String getEvenNumbers(int start, int stop) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start; i < stop; i++) {
            if(i % 2 == 0) {
                arr.add(i);
            }
        }

        String string = arr.toString();
        string = string.replaceAll(", ", "").replaceAll("\\[", "").replaceAll("\\]", "");
        return string;
    }

    public static String getOddNumbers(int start, int stop) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start; i < stop; i++) {
            if(i % 2 != 0) {
                arr.add(i);
            }
        }

        String string = arr.toString();
        string = string.replaceAll(", ", "").replaceAll("\\[", "").replaceAll("\\]", "");
        return string;
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        ArrayList<Double> arr = new ArrayList<>();

        for (int i = start; i <= stop; i++) {
            arr.add(Math.pow(i, exponent));
        }

        String string = arr.toString();
        string = string.replaceAll(", ", "").replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(".0", "");
        return string;
    }
    
    
    public static String getRange(int stop) {
        String string = "";
        for(int i = 0; i<stop; i++){
            string = string+i;
        }
        return string;
    }
}
