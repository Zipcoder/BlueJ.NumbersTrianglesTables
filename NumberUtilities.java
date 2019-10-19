

public class NumberUtilities {

    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++){
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++){
            range += i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i+=step){
            range += i;
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0)
            range += i;
        }
        return range;
    }


    public static String getOddNumbers(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 1){
            range += i;
            }
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String range = "";
        int result;
        for (int i = start; i <= stop; i++){
            result = (int) Math.pow (i, exponent);
            range += Integer.toString (result);
        }
            System.out.println(range);
            return range;
    }
}
