 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
       String star= "";
        for(int i= 0; i< numberOfStars; i++){
          star += "*";

        }
        return star;
    }
    
    public static String getTriangle(int numberOfRows) {
       String star= "";
        for(int i= 1; i <= numberOfRows; i++){
            for(int j = 1; j <= i; j++){
            star += "*"; }
            star += "\n";
        }
         return star;
    }


    public static String getSmallTriangle() {
         String star= "";
        for(int i= 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
            star += "*"; }
            star += "\n";
        }
         return star;
    }

    public static String getLargeTriangle() {
        String star= "";
        for(int i= 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
            star += "*"; }
            star += "\n";
        }
         return star;
    }
}
