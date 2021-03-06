 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= numberOfStars; i++){
            sb = sb.append("*");
        }
        return sb.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= numberOfRows; i++){
            sb = sb.append("*");
        }
        return sb.toString();
    }


    public static String getSmallTriangle() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                sb = sb.append("*");
            }
            sb = sb.append("\n");
        }
        return sb.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j <= i; j++){
                    sb = sb.append("*");
            }
            sb= sb.append("\n");
        }
        return sb.toString();
    }
}
