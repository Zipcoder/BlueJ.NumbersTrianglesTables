 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String x = "";
        for( int i=0; i < numberOfStars; i++){
            x += "*";
        }
        return x;
    }
    
    public static String getTriangle(int numberOfRows) {
        String x = "";
        for (int i=0; i < numberOfRows; i++){
            for (int j = 0; j <= i; j++){
                x += "*";
            }
            x += "\n";
        }
            return x;
    }


    public static String getSmallTriangle() {
        
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
