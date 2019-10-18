 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
         String output = "";
         for(int i = 1; i <= tableSize; i++) { 
            
            for( int j = 1; j<=tableSize; j++){
                int num = (i * j);
                output += String.format("%3d |", num);
            }
            output += "\n";
    }
    return output;
}
}
