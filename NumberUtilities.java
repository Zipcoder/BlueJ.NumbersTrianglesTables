


public class NumberUtilities {

    public static String getRange(int stop) {
       String outcome = "";
       for(int i = 0; i < stop; i++) {
           outcome += i;
    }
    
    return outcome;
}
    public static String getRange(int start, int stop) {
        String outcome = "";
        for(int i = start; i < stop; i++) { 
            outcome += i;
    }
    return outcome;
}

    public static String getRange(int start, int stop, int step) {
        String outcome = "";
         for(int i = start; i < stop; i = i + step) { 
            outcome += i;
    }
    return outcome;
}

    public static String getEvenNumbers(int start, int stop) {
         String outcome = "";
         for(int i = start; i < stop; i++) { 
            if (i % 2 == 0) {
                outcome += i;
            }
        }
            return outcome;
    
}

    public static String getOddNumbers(int start, int stop) {
        String outcome = "";
         for(int i = start; i < stop; i++) { 
            if (i % 2 != 0) {
                outcome += i;
            }
        }
            return outcome;
        

    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String outcome = "";
         for(int i = start; i <= stop; i++) { 
            {
                outcome = outcome + (int)(Math.pow(i, exponent));
            }
        }
            return outcome;
        }
}
    

