 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";

        for (int i = 0; i < numberOfStars; i++) {
            // return a row of stars
            //add to row a star
            row = row + "*";

        }
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        //outter loop as vertical
        //inside loop as backwards to vertical
        String row = "";
        for (int i = 1; i <= numberOfRows; i++) {

            for (int j = i; j > 0; j--) {
                row = row + "*";

            }
            row = row + "\n";

        }

        return row;
    }


    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {

        return getTriangle(9);
    }
}
