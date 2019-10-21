 
public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
        
        for (int x = 0; x < numberOfStars; x++){
            result = result + "*";
        }
        return result;
    }
    
    public static String getTriangle(int numberOfRows) {
        String result = "";
        
        for (int row = 1; row < numberOfRows + 1 ; row++){
            for(int stars = 0; stars < row; stars++){
            result = result + "*"; 
             }
             result = result + "\n";
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
