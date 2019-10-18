
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String width = "";
        for (int i= 0; i < numberOfStars; i++) {
            width = width + "*";
        }
        return width;
    }

    public static String getTriangle(int numberOfRows) {
        String length = "";
        for (int i= 0; i < numberOfRows; i++) {
            length = "*\n";
        }
        return length;
    }

    public static String getSmallTriangle() {
        String star = "";
        for (int i = 1; i < 5; i++){
            for (int j = 0; j < i; j++){
                star = star + "*";
            }
            star = star + "\n";
        }
        return star;
    }

    public static String getLargeTriangle() {
        String star = "";
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++){
                star = star + "*";
            }
            star = star + "\n";
        }
        return star;
    }
}
