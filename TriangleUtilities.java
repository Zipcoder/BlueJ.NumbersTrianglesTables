
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String outcome = "";
        for (int i = 1; i <= numberOfStars; i++){
            outcome += "*";
        }
        return outcome;
    }

    public static String getTriangle(int numberOfRows) {
        String outcome = "";
        for (int i = 1; i <= numberOfRows; i++){
            outcome += getRow(i);
            outcome += "\n";
        }
        return outcome;
    }

    public static String getSmallTriangle() {
        String outcome = "";
        for (int i = 1; i <= 4; i++){
            outcome += getRow(i);
            outcome += "\n";
        }
        return outcome;
    }

    public static String getLargeTriangle() {
        String outcome = "";
        for (int i = 1; i <= 9; i++){
            outcome += getRow(i);
            outcome += "\n";
        }
        return outcome;
    }
}