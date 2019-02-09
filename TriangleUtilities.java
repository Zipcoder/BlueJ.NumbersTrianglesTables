
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String a = "";
        for(int i = 1; i <= numberOfStars; i++){
            a += "*";
        }
        return a;
    }

    public static String getTriangle(int numberOfRows) {
        String rows = "";
        for(int i = 1; i <= numberOfRows; i++){
            for(int j = 1; j <= i; j++){
                rows += "*";
            }
            rows += "\n";
        }
        System.out.print(rows);
        return rows;
    }

    public static String getSmallTriangle() {
        String rows = "";
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                rows += "*";
            }
            rows += "\n";
        }
        return rows;
    }

    public static String getLargeTriangle() {
        String rows = "";
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                rows += "*";
            }
            rows += "\n";
        }
        return rows;
    }
}
