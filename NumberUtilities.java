


public class NumberUtilities {

   public static String getRange(int stop) { 
        String count = "";
        for (int i = 0; i < stop; i++) {
        count = count.concat(Integer.toString(i));  
        }
        
        return count;
}

    public static String getRange(int start, int stop) {
    String count = "";
    for (int i = start; i < stop; i++) {
     count = count.concat(Integer.toString(i)); 
    }
    return count;
    }


    public static String getRange(int start, int stop, int step) {
        String count = "";
        for (int i = start; i < stop; i+=step) {
        count = count.concat(Integer.toString(i)); 
        }
        return count;
       }
       

    public static String getEvenNumbers(int start, int stop) {
       String count = "";
        for (int i = start; i < stop; i++) {
        if (i % 2 == 0) {
        count = count.concat(Integer.toString(i)); 
        }
       }
        return count;
   }
    public static String getOddNumbers(int start, int stop) {
       String count = "";
        for (int i = start; i < stop; i++) {
        if (i % 2 != 0) {
        count = count.concat(Integer.toString(i)); 
        }
       }
        return count;
   }

    public static String getExponentiations(int start, int stop, int exponent) {
        String count = "";
        int result = 0;
        for (int i = start; i <= stop; i++) {
        result = (int)Math.pow(i, exponent);
        count = count.concat(Integer.toString(result));
        }
    return count;
   }
}   
