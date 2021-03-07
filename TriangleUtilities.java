 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String output = "";
        char[] starArr = new char[numberOfStars];
        for (int i = 0; i < numberOfStars; i++) {
            starArr[i] = '*';
            String strStars = Character.toString(starArr[i]);
            output += strStars;
        }
        return output;
    }
    
    public static String getTriangle(int numberOfRows) {
         int i, j;
         String output = "";
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<=numberOfRows; i++)
        { String holder = "";
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop    
            for(j=0; j<i; j++)
            {
                // printing stars
                holder += getRow(i) + "\n";
            }
 
            // ending line after each row
            //System.out.println();
            output += holder;
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
