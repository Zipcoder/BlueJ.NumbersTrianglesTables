


public class NumberUtilities {

    public static String getRange(int stop) {
        String outcome = "";
        for(int i = 0; i < stop; i++){
            outcome += i;
        } return outcome;
    } 

    public static String getRange(int start, int stop) {
        String outcome = "";
        for(int i = start; i < stop; i++){
            outcome += i;
        } return outcome;
    }


    public static String getRange(int start, int stop, int step) {
            String outcome = "";
        for(int i = start; i < stop; i+=step){
            outcome += i;
        } return outcome;
    }

    public static String getEvenNumbers(int start, int stop) {
             String outcome = "";
             int j = start % 2;
        
             
             if (j != 0){  
        for(int i = start + 1; i < stop; i+=2){
            outcome += i;
        } return outcome;
    } else {
        for(int i = start; i < stop; i+=2){
            outcome += i;
        }
       return outcome; 
    } 
}


    public static String getOddNumbers(int start, int stop) {
            String outcome = "";
        for(int i = start; i < stop; i+=2){
            if (i%2 == 1){
                outcome += i;
                }
                }return outcome;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
                String outcome = "";

        for(int i = start; i <= stop; i++){
            outcome = outcome + (int)Math.pow(i, exponent);
        } return outcome;
    }
}
