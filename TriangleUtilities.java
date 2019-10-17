 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String rowStars = "";
        
        for (int i=0; i<numberOfStars; i++){
            rowStars += "*"; 
        }    
        return rowStars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String row = "";
        
        for (int i=1; i<numberOfRows + 1; i++){
            
            for (int j=0; j<i; j++){
               row += "*";   
            }
            row = row + "\n";
        }    
        return row;
    }


    public static String getSmallTriangle() {
        String row = "";
        int numberOfRows = 4;
        
        for (int i=1; i<numberOfRows + 1; i++){
            
            for (int j=0; j<i; j++){
               row += "*";   
            }
            row = row + "\n";
        }    
        return row;
    }

    public static String getLargeTriangle() {
        String row = "";
        int numberOfRows = 9;
        
        for (int i=1; i<numberOfRows + 1; i++){
            
            for (int j=0; j<i; j++){
               row += "*";   
            }
            row = row + "\n";
        }    
        return row;
    }
}
