 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String smallTable = "";
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
            String cell = String.format("%3s |", i * j);
            smallTable += cell;
        }        
        smallTable += "\n";
    }
        return smallTable;
    }

    public static String getLargeMultiplicationTable() {
        String largeTable = "";
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
            String cell = String.format("%3s |", i * j);
            largeTable += cell;
        }        
        largeTable += "\n";
    }
        return largeTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        String multiTable = "";
        for (int i = 1; i <= tableSize; i ++){
            for (int j = 1; j <= tableSize; j++){
            String cell = String.format("%3s |", i * j);
            multiTable += cell;
        }   
        multiTable += "\n";
    }
        return multiTable;
    }
}
