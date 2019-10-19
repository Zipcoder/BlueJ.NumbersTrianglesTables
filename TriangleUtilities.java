
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String rowOfStars = "";
        for(int i = 1; i <= numberOfStars; i++) {
            rowOfStars += "*";
        }
        return rowOfStars;
    }

    public static String getTriangle(int numberOfRows) {
        String triangleRow = "";

        for(int i = 1; i <= numberOfRows; i++){
            triangleRow += getRow(i) + "\n";
        }
        return triangleRow;
    }

    public static String getSmallTriangle() {
        int numberOfRows = 4;
        return getTriangle(numberOfRows);
    }

    public static String getLargeTriangle() {
        int numberOfRows = 9;
        return getTriangle(numberOfRows);
    }
}
