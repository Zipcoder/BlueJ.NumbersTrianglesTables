 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String catty = "";
        for(int i = 0; i < numberOfStars; i++){
            catty = catty + "*";
        }
        return catty;
    }
    
    public static String getTriangle(int numberOfRows) {
        String catty = "";
        for(int i = 1; i <= numberOfRows; i++){
            catty = catty + TriangleUtilities.getRow(i) + "\n";
        }
        return catty;
    }


    public static String getSmallTriangle() {
        return "*\n**\n***\n****\n";
    }

    public static String getLargeTriangle() {
        return "*\n**\n***\n****\n*****\n******\n*******\n********\n*********\n";
    }
}
