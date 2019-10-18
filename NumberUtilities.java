


public class NumberUtilities {

    public static String getRange(int stop) {
        String rangeTo = "";
        for(int i=0; i< stop; i++ ){
            rangeTo += i;
        }
         
        return rangeTo;
    }

    public static String getRange(int start, int stop) {
        String rangeTo = "";
        for(int i = start; i < stop; i++){
            rangeTo += i;
        }
        return rangeTo;
    }


    public static String getRange(int start, int stop, int step) {
        String rangeTo = "";
        for(int i = start; i < stop; i += step){
            rangeTo += i;
        }
        return rangeTo;
        
    }

    public static String getEvenNumbers(int start, int stop) {
        String rangeTo = "";
        for(int i = start; i < stop; i++){
           if (i % 2 == 0){
            rangeTo += i;
        }
        }
        return rangeTo;
  
    }


    public static String getOddNumbers(int start, int stop) {
        String rangeTo = "";
        for(int i = start; i < stop; i++){
           if (i % 2 != 0){
            rangeTo += i;
        }
        }
        return rangeTo;
  
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String rangeTo = "";
        for(int i = start; i <= stop; i++){
            rangeTo += (int)Math.pow(i, exponent); 
            
        }
        return rangeTo;
    }
}
