
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String string = "";
        for(int i = 1; i <= numberOfStars; i++){
            string = string + "*";
        }
        return string;
    }

    public static String getTriangle(int numberOfRows) {
        String string = "";
        for (int i = 1; i <= numberOfRows; i++)
        {  
            for (int j = 1; j <= i; j++)
            string = string + "*";
            string = string + "\n";
        }   return string;
    } 

    public static String getSmallTriangle() {
          String string = "";
        for (int i = 1; i <= 4; i++)
        {  
            for (int j = 1; j <= i; j++)
            string = string + "*";
            string = string + "\n";
        }   return string;
    }

    public static String getLargeTriangle() {
              String string = "";
        for (int i = 1; i <= 9; i++)
        {  
            for (int j = 1; j <= i; j++)
            string = string + "*";
            string = string + "\n";
        }   return string;
    }
}
