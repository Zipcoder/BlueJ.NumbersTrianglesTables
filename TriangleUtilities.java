 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        
        String result = "*".repeat(numberOfStars);
        return result;
    }
    
    public static String getTriangle(int numberOfRows) {
        
        String result = ""; 
        
        for (int i = 1; i <= numberOfRows; i++){
            result = result + "*".repeat(i) + "\n";
        }
        
        return result;
    }


    public static String getSmallTriangle() {
        
        String result = ""; 
        
        for (int i = 1; i <= 4; i++){
            result = result + "*".repeat(i) + "\n";
        }
        
        return result;
    }

    public static String getLargeTriangle() {
        
        String result = ""; 
        
        for (int i = 1; i <= 9; i++){
            result = result + "*".repeat(i) + "\n";
        }
        
        return result;
    }
}
