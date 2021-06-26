 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String word = "";
        for (int i = 0; i < numberOfStars; i++) {
            word += "*";
        } 
        return word;
    }
    
    public static String getTriangle(int numberOfRows) {
        String word = "";
        for (int i = 0; i < numberOfRows; i++) {
            for(int j = 0; j <=i; j++){
                word += "*";
            }
            word += "\n";
        } 
        return word;
    }


    public static String getSmallTriangle() {
        String word = "";
        for (int i = 0; i <= 3; i++) {
            for(int j = 0; j <=i; j++){
                word += "*";
            }
            word += "\n";
        } 
        return word;
    }

    public static String getLargeTriangle() {
              String word = "";
        for (int i = 0; i < 9; i++) {
            for(int j = 0; j <=i; j++){
                word += "*";
            }
            word += "\n";
        } 
        return word;
    }
}
