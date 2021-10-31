 public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String outcome = "";

        for (int i = 0; i < numberOfStars; i++) {
            outcome += "*";
        }
        
        return outcome;
    }
    
    public static String getTriangle(int numberOfRows) {
        String outcome = "";
        String stars = "*";

        for (int i = 1; i <= numberOfRows; i++) {
            outcome += stars.repeat(i) + "\n";
        }
        
        return outcome;
    }

    public static String getSmallTriangle() {
        String outcome = "";
        String stars = "*";

        for (int i = 1; i <= 4; i++) {
            outcome += stars.repeat(i) + "\n";
        }
        
        return outcome;
    }

    public static String getLargeTriangle() {
        String outcome = "";
        String stars = "*";

        for (int i = 1; i <= 9; i++) {
            outcome += stars.repeat(i) + "\n";
        }
        
        return outcome;
    }
}