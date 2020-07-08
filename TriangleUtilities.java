
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String star = "";
        for (int x = 0; x < numberOfStars; x++){
            star = star + "*";
        }
        return star;
    }

    public static String getTriangle(int numberOfRows) {
        String star = "";
        for (int x = 1; x < numberOfRows + 1; x++){
            for(int y = 0; y < x; y++){
            star = star + "*";
        }
            star = star + "\n";
        }
        return star;
    }


    public static String getSmallTriangle() {
        String star = "";
        for (int x = 1; x < 4 + 1; x++){
            for(int y = 0; y < x; y++){
            star = star + "*";
        }
            star = star + "\n";
        }
        return star;
    }

    public static String getLargeTriangle() {
        String star = "";
        for (int x = 1; x < 9 + 1; x++){
            for(int y = 0; y < x; y++){
            star = star + "*";
        }
            star = star + "\n";
        }
        return star;
    }
}