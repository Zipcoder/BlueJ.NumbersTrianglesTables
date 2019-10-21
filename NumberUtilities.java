


public class NumberUtilities {

    public static String getRange(int stop) {
        String result = ""; 
       
        for (int x = 0; x < stop; x++){
            result = result + Integer.toString(x);
        }
        return result;
    }

    public static String getRange(int start, int stop) {
       String result = "";
       
        for (int x = start; x < stop; x++){
            result = result + Integer.toString(x);
       }
        return result;
    }

    public static String getRange(int start, int stop, int step) {
       String result = "";
       
        for (int x = start; x < stop; x++){
            
            if( x % step == 0 ){
                result = result + Integer.toString(x);
            }
       }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
       String result = "";
       
        for (int x = start; x < stop; x++){
            
            if( x % 2 == 0 ){
                result = result + Integer.toString(x);
            }
       }
        return result; 
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        
        for (int x = start; x < stop; x++){
            
            if( x % 2 != 0 ){
                result = result + Integer.toString(x);
            }
       }
        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
         String result = "";
         int num = 0;
         
        for (int x = start; x <= stop; x++){
             
            num = x;
            
            for(int y = 1; y < exponent; y++){
                num = num * x ;
            }
            
           result = result + Integer.toString(num);
       }
        return result;
    }
}
