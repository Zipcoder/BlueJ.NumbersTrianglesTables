
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i= 1; i <= numberOfStars; i++) {
            result = result + "*";
        }
        return result;
    }

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int j= 1; j <= numberOfRows; j++) {
            /*for (int j = 0; j < i; j++) {
                length+="*";
            }*/
            result += getRow(j);
            result += "\n";
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
