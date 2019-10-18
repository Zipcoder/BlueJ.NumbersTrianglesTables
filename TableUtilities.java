 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return null;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        /**String table = "";
        String table2 = "";
        for (int i = 1; i<= tableSize; i++){
            if (tableSize == 1){
            table = "  " + tableSize + " |";
            table += "\n";
        }
            else if (tableSize > 1){
            
            }
        }
            
            
        }**/
        
        String table = "";
        for (int i = 1; i <= tableSize; i++){
            table += "\n";
            for (int j = 1; j <= tableSize; j++){
            table +="  " + j + " |";
            
            }
        }
        System.out.println(table);
        return table;
    }
}
