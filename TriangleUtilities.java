 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String rows = "";
        for(int i = 1; i <= numberOfStars; i++){
            rows += "*";
        }    
        return rows;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangleRow = "";
        for(int i = 1; i <= numberOfRows; i++){
            triangleRow += "*\n";
        }
        return triangleRow;
    }


    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
