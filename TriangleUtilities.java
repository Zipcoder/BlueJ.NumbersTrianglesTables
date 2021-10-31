 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 1; i<=numberOfStars; i++){
            stars = stars + "*";
        }
        return stars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String stars = "";
        
        for(int i = 1; i<=numberOfRows; i++){
            for(int j = 1; j<=i; j++) {
              stars = stars + "*";   
            }
            stars = stars + "\n"; 
        }
        return stars;
        
    }


    public static String getSmallTriangle() {
        String stars = "";
        
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++) {
              stars = stars + "*";   
            }
            stars = stars + "\n"; 
        }
        return stars;
    }

    public static String getLargeTriangle() {
        String stars = "";
        
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=i; j++) {
              stars = stars + "*";   
            }
            stars = stars + "\n"; 
        }
        return stars;
    }
}
