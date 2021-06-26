


public class NumberUtilities {
    
    public static String getRange(int stop) {
      String a = "";
        for (int i = 0; i < stop; i++){
            a += i;
        }
        return a;
    }

    public static String getRange(int start, int stop) {
        String b = "";
        for(int i = start; i < stop; i++){
            b += i;
        }
        return b;
    }


    public static String getRange(int start, int stop, int step) {
        String c = "";
        for(int i = start; i < stop; i++){
            if(i % step == 0){
                c += i;
            }
        }
        return c;
    }

    public static String getEvenNumbers(int start, int stop) {
        String d = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                d += i;
            }
        }
        return d;
    }


    public static String getOddNumbers(int start, int stop) {
        String e = "";
        for(int i = start; i < stop; i++){
            if(i % 2 != 0){
                e += i;
            }
        }
        return e;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String f = ""; 
        for(int i = start; i <= stop; i++){
            f += (int) Math.pow(i, exponent);
        }
        return f;
    }
}

