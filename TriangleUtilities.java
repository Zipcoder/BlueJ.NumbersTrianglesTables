 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String stars = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= numberOfStars; i++){
            stars = sb.append("*").toString();
        }
        return stars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String rows = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numberOfRows; i++){
            rows = sb.append("*").toString();
        }
        return rows;
    }


    public static String getSmallTriangle() {
        String smallTriangle = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(j <= i){
                    smallTriangle = sb.append("*").toString();
                }
            }
            smallTriangle = sb.append("\n").toString();
        }
        return smallTriangle;
    }

    public static String getLargeTriangle() {
        String largeTriangle = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(j <= i){
                    largeTriangle = sb.append("*").toString();
                }
            }
            largeTriangle = sb.append("\n").toString();
        }
        return largeTriangle;
    }
}
