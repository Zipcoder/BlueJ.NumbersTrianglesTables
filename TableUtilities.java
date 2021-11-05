 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result ="";
        for(int i = 1; i <= tableSize; i++){
        for(int k = 1; k <= tableSize; k++){
         result += String.format("%3s", i*k) + " |";   
            
        
        }
        
        result += "\n";
        }
              
        return result;
    }
}
