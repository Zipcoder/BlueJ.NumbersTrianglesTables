
public class TriangleUtilities {
    
    public static String getRow(Integer numberOfStars) {
        String stars = "*";
        String row = stars.repeat(numberOfStars);
        /*for(int i = 1; i <= numberOfStars; i++){
            row += "*";
        }*/
        return row;
    }

    public static String getTriangle(int numberOfRows) {
        //Removed the nested FOR loop
        
        StringBuilder sb = new StringBuilder();
        String stars = "*";
        for(int i = 1; i <= numberOfRows; i++){
            sb.append(stars.repeat(i));
            sb.append("\n");
        /*(int i = 1; i <= numberOfRows; i++){
            triangle += getRow(i);
            triangle += "\n";
        }*/
    }
        return sb.toString();
    }
    public static String getSmallTriangle() {
        return getTriangle(4);
    }
    
    public static String getLargeTriangle() {
        return getTriangle(9);
    }  
}

    

    


