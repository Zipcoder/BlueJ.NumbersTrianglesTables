
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String star = "";
        for(int i = 1; i <= numberOfStars; i++)  {
            star = star + "*"; 
        }   return star;
    }

    public static String getTriangle(int numberOfRows) {
        String star = "";
        for(int i = 1; i < numberOfRows + 1; i++)  {
            star += getRow(i);
            star = star + "\n";
        }   
        return star;
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
        /*
        for(int i = 1; i < 4 + 1; i++)  {
        for( int j = 0; j < i; j++) {

        star = star + "*"; 
        }star = star + "\n";
        }   return star;*/
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
        /*
        for(int i = 1; i < 9 + 1; i++)  {
        for( int j = 0; j < i; j++) {

        star = star + "*"; 
        }star = star + "\n";
        }   return star;*/
    }

}
