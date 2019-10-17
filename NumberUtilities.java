


public class NumberUtilities {

    public static String getRange(int stop) {
        String rangeNumbers = "";
        
        for (int i = 0; i<stop; i++){
            
            
                rangeNumbers += Integer.toString(i);
              
        }
        return rangeNumbers;
    }

    public static String getRange(int start, int stop) {
        String rangeNumbers = "";
        
        for (int i = start; i<stop; i++){
            
            
               rangeNumbers += Integer.toString(i);
              
        }
        return rangeNumbers;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        
        for (int i = start; i<stop; i++){
            
            if (i%2==0) {
                evenNumbers += Integer.toString(i);
            }    
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        
        for (int i = start; i<stop; i++){
            
            if (i%2!=0) {
                oddNumbers += Integer.toString(i);
            }    
        }
        return oddNumbers;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String exponentNumbers = "";
        
        for (int i = start; i<=stop; i++){
                
                exponentNumbers += String.valueOf((int) Math.pow(i,exponent));
                
        }
        return exponentNumbers;
    }
}
