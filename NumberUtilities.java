


public class NumberUtilities {

    public static String getRange(int stop) {
        String ans = "";
        for(int i=0;i<stop;i++){
           ans +=i;
        }
        return ans;
    }

    public static String getRange(int start, int stop) {
        String ans = "";
        for(int i=start;i<stop;i++){
           ans +=i;
        }
        return ans;
    }


    public static String getRange(int start, int stop, int step) {
         String ans = "";
        for(int i=start;i<stop;i=i+step){
           ans +=i;
        }
        return ans;
    }

    public static String getEvenNumbers(int start, int stop) {
           String ans = "";
        for(int i=start;i<stop;i++){
           if(i%2==0) {
            ans +=i;
        } else {
            ans = ans;
        }
        }
        return ans;
    }


    public static String getOddNumbers(int start, int stop) {
           String ans = "";
        for(int i=start;i<stop;i++){
           if(i%2==1) {
            ans +=i;
        } else {
            ans = ans;
        }
        }
        return ans;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String ans = "";
        for(int i=start;i<=stop;i++){
           ans +=(int)Math.pow(i,exponent);
        }
        return ans;
    }
}
