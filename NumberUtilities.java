


public class NumberUtilities {

    public static String getRange(int stop) {
        String numbers = "";
        for(int i = 0; i < stop; i++){
            numbers += i;
            }    
            
        return numbers;
    }

    public static String getRange(int start, int stop) {
        String numbers = "";
        for(int i = start; i < stop; i++){
            numbers += i;
        }
        return numbers;
    }


    public static String getRange(int start, int stop, int step) {
        String numbers = "";
        for(int i = start; i < stop; i += step){
            numbers += i;
        }
        return numbers;
    }

    public static String getEvenNumbers(int start, int stop) {
        String numbers = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                numbers += i;
            }
        }
        return numbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String numbers = "";
        for(int i = start; i < stop; i++){
            if(i % 2 != 0){
                numbers += i;
            }
        }
        return numbers;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuilder exp = new StringBuilder();
        for(int i = start; i <= stop; i++){
                exp = exp.append(Math.round(Math.pow(i,exponent)));
        }
        return exp.toString();
    }
}
