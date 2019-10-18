 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String rowBuilder = "";
        for (int i = 0; i < numberOfStars; i++) {
            rowBuilder += "*";
        }
        return rowBuilder;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangleBuilder = "";
        for (int i = 1; i <= numberOfRows; i++) {
            triangleBuilder += getRow(i) + "\n";
        }
        return triangleBuilder;
    }


    public static String getSmallTriangle() {
        String triangleBuilder = "";
        for (int i = 1; i <= 4; i++) {
            triangleBuilder += getRow(i) + "\n";
        }
        return triangleBuilder;
    }

    public static String getLargeTriangle() {
        String triangleBuilder = "";
        for (int i = 1; i <= 9; i++) {
            triangleBuilder += getRow(i) + "\n";
        }
        return triangleBuilder;
    }
}
