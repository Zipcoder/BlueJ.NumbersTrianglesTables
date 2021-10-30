 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String StarRow = "";
        for (Integer i = 0; i < numberOfStars; i++) {
            StarRow += "*";
        }
        return StarRow;
    }
    
    public static String getTriangle(int numberOfRows) {
        String str1 = "";
        
        //for each iteration of the loop, str1 concatenates with the output of the function
        for (Integer i = 0; i < numberOfRows; i++) {
            str1 += TriangleUtilities.getRow(i+1) + "\n";
        }
        
        return str1;
    }


    public static String getSmallTriangle() {
        String SmallTri = "";
        
        //same as getTriangle, but limited to 4 loops (0, 1, 2, 3)
        for (Integer i = 0; i < 4; i++) {
            SmallTri += TriangleUtilities.getRow(i+1) + "\n";
        }
        
        return SmallTri;
    }

    public static String getLargeTriangle() {
        String LargeTri = "";
        
        //same as getTriangle, but limited to 9 loops (0 - 8)
        for (Integer i = 0; i < 9; i++) {
            LargeTri += TriangleUtilities.getRow(i+1) + "\n";
        }
        
        return LargeTri;
    }
}
