 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String output = "";
        char[] starArr = new char[numberOfStars];
        for (int i = 0; i < numberOfStars; i++) {
            starArr[i] = '*';
            String strStars = Character.toString(starArr[i]);
            output += strStars;
        }
        System.out.print(output);
        return output;
    }
    
    public static String getTriangle(int numberOfRows) {
        int i, j;
        String output = "";
        for (i = 0; i < numberOfRows; i++) {
            for (j = 0; j <= i; j++) {
                output += "*";
            }
            output += "\n";
        }
        System.out.print(output);
        return output;
    } 



    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
