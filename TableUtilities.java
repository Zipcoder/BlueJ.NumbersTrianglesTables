 

public class TableUtilities {
    public static String getSmallMultiplicationTable(int n) {
        String largeTable = getMultiplicationTable(n);
        return largeTable;
    }

    public static String getLargeMultiplicationTable(int n) {
        String largeTable = getMultiplicationTable(n);
        return largeTable;
        
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
            
            for (int j = 1; j <= tableSize; j++){
                int table2 = j * i;
                int lengthOfString = String.valueOf(table2).length();
                if (lengthOfString < 2){
                table +="  " + table2 + " |";
            }
                else if (lengthOfString == 2 ){
                table +=" " + table2 + " |";
            }
                else{
                table +="" + table2 + " |";
            }
            
        }
        table += "\n";
        }
        System.out.println(table);
        return table;
    }
}
