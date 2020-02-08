 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
        for(int i = 1; i <= numberOfStars; i++) {
        result += "*";
    }
    return result;
}
    
public static String getTriangle(int numberOfRows) {
     String result2 = ""; 
     for(int i = 1; i <= numberOfRows; i++) 
     {
      result2 += getRow(i) + "\n" ; 
    }
    return result2;
}

    public static String getSmallTriangle() {
        String result3 ="";
        for(int i = 1; i <= 4; i++)
        {
         result3 += getRow(i) + "\n"; 
        }
        return result3;
    }

    public static String getLargeTriangle() {
        String result4 ="";
        for(int i = 1; i <= 9; i++)
        {
         result4 += getRow(i) + "\n"; 
        }
        return result4;
    }
}
