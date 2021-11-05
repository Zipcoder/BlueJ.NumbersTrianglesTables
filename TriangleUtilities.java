 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result ="";
        for (int i = 0; i < numberOfStars; i++) {
           result += "*";
        }

        return result;
    }
    
    public static String getTriangle(int numberOfRows) {
    String result = "";
    for(int i = 0; i < numberOfRows; i++){
       
        for(int j = 0; j < i; j++){
         result += "*";
        }
        
        result += "*\n";
    
    }    
    
     return result;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
