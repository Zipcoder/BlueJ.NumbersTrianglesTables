 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        return new String(new char[numberOfStars]).replace("\0", "*");
    }
    
    public static String getTriangle(int numberOfRows) {
        String response = "";
        for (int i = 1; i <= numberOfRows; i++){
            response += getRow(i);
            response += "\n";
        }
        return response;
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
