


public class NumberUtilities {

    public static String getRange(int stop) {
        String rangeNumbers = "";
        
        for (int i = 0; i<stop; i++){
            
            
                rangeNumbers = rangeNumbers + i;
              
        }
        return rangeNumbers;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        
        for (int i = start; i<stop; i++){
            
            if (i%2==0) {
                evenNumbers = evenNumbers + i;
            }    
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        
        for (int i = start; i<stop; i++){
            
            if (i%2!=0) {
                oddNumbers = oddNumbers + i;
            }    
        }
        return oddNumbers;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        return null;
    }
}
