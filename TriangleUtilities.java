 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        return "*".repeat(numberOfStars);
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for(int i = 1; i <= numberOfRows; i++) {
            triangle += getRow(i) + "\n";
        }
        System.out.println(triangle);
        return triangle;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
