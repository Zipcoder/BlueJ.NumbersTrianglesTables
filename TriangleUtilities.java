 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
    String count = "";
    for (int i = 0; i < numberOfStars; i++) {
    count = count + "*"; 
    }
    return count;
    }
    
    public static String getTriangle(int numberOfRows) {
        String count = "";
        for (int i = 1; i <= numberOfRows; i++) {
        for(int j = i; j > 0; j--) {
            
        count = count + "*";
        }
        count = count + "\n";
     }
     return count;
     
}


    public static String getSmallTriangle() {
           String count = "";
        for (int i = 0; i <= 4; i++) { 
        for (int j = 1; j <= i; j++) {
            // column is less than equal to row
            count = count + "*";
            }
        count = count + "\n";
        return getTriangle(4);
         }
         return count;
        }
      
   

    public static String getLargeTriangle() {
      return getTriangle(9);
    }
}


