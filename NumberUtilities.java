


public class NumberUtilities {

    public static String getRange(int stop) {
        String a = "";
        for(int i=0 ; i<stop ; i++){
           a = a + i; 
        }
        return a;
    }

    public static String getRange(int start, int stop) {
        String a = "";
        for(int i = start; i < stop ;i++){
         a = a + i;
        }
        return a;
    }


    public static String getRange(int start, int stop, int step) {
        String a = "";
        for(int i = start; i < stop; i+=step){
            a = a + i;
        }
        return a;
   }
    
public static String getEvenNumbers(int start, int stop) {
    String a = "";
    for(int i = start; i < stop;i++){
        if(i % 2 == 0){
            a = a + i;
        }
    }
    return a; 
}
  
public static String getOddNumbers(int start, int stop) {
    String a = "";
    for(int i = start; i< stop; i ++){
        if(i % 2 == 1){
            a = a + i;
        }
    }
    return a;
    }


public static String getExponentiations(int start, int stop, int exponent) {
    String a = "";
    for(int i = start; i <= stop;i++){
     a = a + (int) Math.pow(i,exponent);
    }
    
    return a;
    }
}
