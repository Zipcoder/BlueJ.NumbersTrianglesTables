


public class NumberUtilities {

    public static String getRange(int stop) {
        String target="";
        for(int i=0;i<stop;i++)
        {
        target=target+i;
        }
        return target;
        
    }

    public static String getRange(int start, int stop) {
        String target="";
        for(int i=start;i<stop;i++){
        target=target+i;}
        return target;
    }


    public static String getRange(int start, int stop, int step) {
        String target="";
        for(int i=start;i<stop;i+=step){
        target=target+i;
        }
 
        return target;
    }

    public static String getEvenNumbers(int start, int stop) {
         
            
        String target="";
        if (start%2 != 0){
                       for(int i=start+1;i<stop;i+=2)
                       {
            
                           target=target+i;
                        }
                    }
            if(start %2 ==0){
            {for(int i=start;i<stop;i+=2)
                {
                target=target+i;
            }
        }
    }   
         
        return target;
    }


    public static String getOddNumbers(int start, int stop) {
        String target="";
        if (start%2 != 0){
                       for(int i=start;i<stop;i+=2)
                       {
            
                           target=target+i;
                        }
            if(start%2==0)
            {for(int i=start+1;i<stop;i+=2)
                {
                target=target+i;
            }
        }
            
         }
        return target;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String target="";
        for(int i=start;i<=stop;i++){
       
            target=target + Math.round((Math.pow(i,exponent)));
        }
            
           
        return target;
    }
    
}
