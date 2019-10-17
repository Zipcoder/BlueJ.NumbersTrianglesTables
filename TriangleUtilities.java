
public class TriangleUtilities {
    
    public static String getRow(Integer numberOfStars) {
        String row = "";
        for(int i = 1; i <= numberOfStars; i++){
            row += "*";
        }
        return row;
    }

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for(int i = 1; i <= numberOfRows; i++){
            triangle += getRow(i);
            triangle += "\n";
        }
        return triangle;
    }
    public static String getSmallTriangle() {
        return getTriangle(4);
    }
    
    public static String getLargeTriangle() {
        return getTriangle(9);
    }  
}

    

    


