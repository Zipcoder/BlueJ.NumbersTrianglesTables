


public class NumberUtilities {

    public static String getRange(int stop) {
       String rangeString = "";
       for (int i = 0; i < stop; i++){
           rangeString += i;
        }
        return rangeString;
    }

    public static String getRange(int start, int stop) {
        String rangeString = "";
       for (int i = start; i < stop; i++){
           rangeString += i;
        }
        return rangeString;
    }


    public static String getRange(int start, int stop, int step) {
        String rangeString = "";
       for (int i = start; i < stop; i+=step){
           rangeString += i;
        }
        return rangeString;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                evenNumbers +=i;
            }
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
          String oddNumbers = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 1){
                oddNumbers +=i;
            }
        }
        return oddNumbers;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String exNumbers = "";
        for (int i = start; i <= stop; i++){
           exNumbers += (int)Math.pow(i,exponent);
          }
        
        return exNumbers;
    }
}
