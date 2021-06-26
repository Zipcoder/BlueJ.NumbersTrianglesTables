 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 0; i < numberOfStars; i++){
            row += "*";
        }    
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        String column = "";
        for (int i = 0; i < numberOfRows; i++){
                for(int j = 0; j <= i ; j++){
                    column += "*";
            }
            column += "\n";
        }    
        return column;
    }


    public static String getSmallTriangle() {
        String column = "";
        for (int i = 0; i < 4; i++){
                for(int j = 0; j <= i ; j++){
                    column += "*";
            }
            column += "\n";
        }    
        return column;
    }

    public static String getLargeTriangle() {
        String column = "";
        for (int i = 0; i < 9; i++){
                for(int j = 0; j <= i ; j++){
                    column += "*";
            }
            column += "\n";
        }    
        return column;
    }
}
