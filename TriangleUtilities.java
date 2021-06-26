 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
       String rowYaBoat = "";
        for(int i = 0; i < numberOfStars; i++){
            rowYaBoat += "*";
        }
    return rowYaBoat;
}

    public static String getTriangle(int numberOfRows) {
         String rowYaBoat = "";
        for(int i = 0; i < numberOfRows; i++){
            for (int j = 0; j <= i; j++){
            rowYaBoat += "*";    
  }
  rowYaBoat += "\n";
}
 return rowYaBoat;
   
    }


    public static String getSmallTriangle() {
        String rowYaBoat = "";
        for(int i = 0; i < 4; i++){
            for (int j = 0; j <= i; j++){
            rowYaBoat += "*";    
  }
  rowYaBoat += "\n";
}
 return rowYaBoat;
    }

    public static String getLargeTriangle() {
       String rowYaBoat = "";
        for(int i = 0; i < 9; i++){
            for (int j = 0; j <= i; j++){
            rowYaBoat += "*";    
  }
  rowYaBoat += "\n";
}
 return rowYaBoat;
    }
}
