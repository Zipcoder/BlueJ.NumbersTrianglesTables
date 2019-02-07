 

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
        for(int j = 0; j < numberOfRows; j++){
            for(int i = 0; i < j + 1; i++){
                container += "*";
            }
            container += "\n";
        }
        return container;
    }


    public static String getSmallTriangle() {
        String container = getTriangle(4);
        return container;
    }

    public static String getLargeTriangle() {
        String container = getTriangle(9);
        return container;
    }
}
