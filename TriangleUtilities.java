 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String container = "";
        for(int i = 0; i < numberOfStars; i++){
            container += "*";
        }
        return container;
    }
    
    public static String getTriangle(int numberOfRows) {
        String container = "";
        for(int j = 1; j <= numberOfRows; j++){
            container += getRow(j) + "\n";
        }
        return container;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
