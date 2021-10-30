


public class NumberUtilities {

    public static String getRange(int stop) {
        String catty = "";
        for(int i = 0; i < stop; i++){
            catty = catty + Integer.toString(i);
        }
        return catty;
    }

    public static String getRange(int start, int stop) {
        String catty = "";
        for(int i = start; i < stop; i++){
            catty = catty + Integer.toString(i);
        }
        return catty;
    }


    public static String getRange(int start, int stop, int step) {
        String catty = "";
        for(int i = start; i < stop; i+=step){
            catty = catty + Integer.toString(i);
        }
        return catty;
    }

    public static String getEvenNumbers(int start, int stop) {
        String catty = "";
        if(start % 2 != 0){
            start++;
        }
        for(int i = start; i < stop; i+=2){
            catty = catty + Integer.toString(i);
        }
        return catty;
    }


    public static String getOddNumbers(int start, int stop) {
        String catty = "";
        if(start % 2 == 0){
            start++;
        }
        for(int i = start; i < stop; i+=2){
            catty = catty + Integer.toString(i);
        }
        return catty;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String catty = "";
        for(int i = start; i <= stop; i++){
            catty = catty + Integer.toString((int) Math.pow(i,exponent));
        }
        return catty;
    }
}
