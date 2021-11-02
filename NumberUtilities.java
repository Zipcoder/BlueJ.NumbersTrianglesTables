


public class NumberUtilities {

    public static String getRange(int stop) {
        int i;
        String nums = "";
        for (i=0; i<stop; i++){
            nums = nums + Integer.toString(i);

        } 
        return nums; 
    }

    public static String getRange(int start, int stop) {
        int i;
        String nums = "";
        for (i=start; i<stop; i++){
            nums = nums + Integer.toString(i);

        } 
        return nums;
    }


    public static String getRange(int start, int stop, int step) {
        int i;
        String nums = "";
        for (i=start; i<stop; i+=step){
            
            nums = nums + Integer.toString(i);

        } 
        return nums;
    }

    public static String getEvenNumbers(int start, int stop) {
        int i;
        String nums = "";
        for (i=start; i<stop; i++){
            if (i%2==0) {
              nums = nums + Integer.toString(i);
        } 
        
    }
    return nums;
}

    public static String getOddNumbers(int start, int stop) {    
        int i;
        String nums = "";
        for (i=start; i<stop; i++){
            if (i%2!=0) {
              nums = nums + Integer.toString(i);
        } 
        
    }
    return nums;
    
        
}


    public static String getExponentiations(int start, int stop, int exponent) {
        int i;
        String nums = "";
        for (i=start; i<=stop; i++){
            Math.pow(i, exponent);
            nums = nums + Integer.toString((int)Math.pow(i, exponent)); 
        }
        
         
        return nums;
        }
    }

