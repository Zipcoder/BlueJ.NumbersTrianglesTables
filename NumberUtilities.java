


public class NumberUtilities {

    public static String getRange(int stop) {
       String result = "";
       
        for(int i = 0; i < stop; i++)  {
           String str = Integer.toString(i);
           result = result + str;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
       
        for(int i = start; i < stop; i++)  {
           String str = Integer.toString(i);
           result = result + str;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        
        
        for(int i = start; i < stop; i++)  {
            if(i % step != 0)  {
                continue;
            }   else    {
                
           String str = Integer.toString(i);
           result = result + str;
        }
    }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
       
        for(int i = start; i < stop; i++)  {
            if(i % 2 != 0)  {
                continue;
            }   else    {
                
           String str = Integer.toString(i);
           result = result + str;
        }
    }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
       
        for(int i = start; i < stop; i++)  {
            if(i % 2 == 0)  {
                continue;
            }   else    {
                
           String str = Integer.toString(i);
           result = result + str;
        }
    }
        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
        int exp;
        
        for(int i = start; i < stop + 1; i++)  {
           exp = (int) Math.pow(i,exponent);
           
     
           String str = Integer.toString(exp);
           result = result + str;
        }return result;
    }
        
    
}
