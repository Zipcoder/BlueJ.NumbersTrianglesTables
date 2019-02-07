


public class NumberUtilities {

    public static String getRange(int stop) {
        String container = "";
        for(int i = 0; i < stop; i++){
            container += Integer.valueOf(i).toString();
        }
        return container;
    }

    public static String getRange(int start, int stop) {
        String container = "";
        for(int i = start; i < stop; i++){
            container += Integer.valueOf(i).toString();
        }
        return container;
    }


    public static String getRange(int start, int stop, int step) {
        String container = "";
        for(int i = start; i < stop; i = i + step){
            container += Integer.valueOf(i).toString();
        }
        return container;
    }

    public static String getEvenNumbers(int start, int stop) {
        String container = "";
        int dummy = ( start % 2 == 1 ) ? 1 : 0;
        for(int i = start + dummy; i < stop; i = i + 2){
            container += Integer.valueOf(i).toString();
        }
        return container;
    }


    public static String getOddNumbers(int start, int stop) {
        String container = "";
        int dummy = ( start % 2 == 0 ) ? 1 : 0;
        for(int i = start + dummy; i < stop; i = i + 2){
            container += Integer.valueOf(i).toString();
        }
        return container;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String container = "";
        int dummy = 0;
        for(int i = start; i <= stop; i++){
            dummy = (int)(Math.pow(i, exponent));
            container += Integer.valueOf(dummy).toString();
        }
        return container;
    }
}
