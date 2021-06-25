 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String x = "";
        for(int i = 0; i < numberOfStars; i++) {
           x += "*"; 
        }
        return x;
    }
    
    public static String getTriangle(int numberOfRows) {
        String a = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int x = 0; x <= i; x++) {
                a += "*";
            }
            a += "\n";
        }
        return a;
    }


    public static String getSmallTriangle() {
        String a = "";
        for (int i = 0; i <= 3; i++) {
            for (int x = 0; x <= i; x++) {
                a += "*";
            }
            a += "\n";
        }
        return a;
    }

    public static String getLargeTriangle() {
        String a = "";
        for (int i = 0; i < 9; i++) {
            for (int x = 0; x <= i; x++) {
                a += "*";
            }
            a += "\n";
        }
        return a;
    }
}
