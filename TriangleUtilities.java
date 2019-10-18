 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String starString = "";
        for (int i=0 ; i< numberOfStars; i++){
         if (i<numberOfStars){
            starString += "*";}
        }
        
        return starString;
        
    }
    
    public static String getTriangle(int numberOfRows) {
        String starTriangle = "";
        for (int i=1 ; i <= numberOfRows; i++){
            starTriangle += getRow(i);
            starTriangle += "\n";
        }
       
        return starTriangle;
    }


    public static String getSmallTriangle() {
        String smallTriangle ="";
        for (int i=1 ; i<=4 ; i++){
        smallTriangle += getRow(i);
        smallTriangle += "\n";
    }
        
        return smallTriangle;
    }

    public static String getLargeTriangle() {
        String largeTriangle ="";
        for (int i=1 ; i<=9 ; i++){
        largeTriangle += getRow(i);
        largeTriangle += "\n";}
        return largeTriangle;
    }
}
