 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String start = "";
        for (int i = 0; i < numberOfStars; i++){
            start += "*";
            
        }
        return start;
    }
    
    public static String getTriangle(int numberOfRows) {
        String row ="";
        for (int i = 0; i < numberOfRows; i++){
            row += "*";
            row += getRow(i) + "\n";
            
        }
        return row;
    }


    public static String getSmallTriangle(int hah) {
        String tri = getTriangle(hah);
        return tri;
    }

    public static String getLargeTriangle(int hah) {
        String tri = getTriangle(hah);
        return tri;
    }
}
