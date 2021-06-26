


public class NumberUtilities {

    public static String getRange(int stop) {
        
        String result = "";
        for (int i = 0; i < stop  ; i++) {
             result += i;
        }
        return result;
        
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            result += i;    
            }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i+=step) {
            result += i;
        
        } 
        
        
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        int rem = start % 2;
        
        
           if (rem != 0) {
            for (int i = start+1; i < stop; i+=2) {
            result += i;
            
            } 
            return result;
        }  else {
        
        for (int i = start; i < stop; i+=2) {
            result += i;
        
        } 
        
        
        return result;
    }
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        int rem = start % 2;
        
       
            for (int i = start; i < stop; i+=2) {
            result += i;
            
            } 
            return result;
      
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        
        String result = "";
        
        for (int i = start; i <= stop; i++) {
             
            int a = (int)Math.pow(i,exponent);
            result += a;
        } return result;
    } 
        
}

