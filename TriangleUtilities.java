 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String rows = "";
        for(int i = 1; i <= numberOfStars; i++){
            rows += "*";
        }    
        return rows;
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int counter = 1; counter <= numberOfRows; counter++){
            for(int counter2 = 1; counter2 <= counter; counter2++){
                stringBuilder.append(getRow(1));
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }


    public static String getSmallTriangle() {
        String buildTriangle = getTriangle(4);
        return buildTriangle;
    }

    public static String getLargeTriangle() {
        String buildTriangle = getTriangle(9);
        return buildTriangle;
    }
}
