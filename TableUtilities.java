 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String tableResult = "";
        int stringLength = 0;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                //tableResult += "  ";
                stringLength = String.valueOf(i * j).length();
                for(int k = 0; k < 3 - stringLength; k++){
                    tableResult += " ";
                }
                tableResult += (i * j) + " |"; 
            }
            tableResult += "\n";
        }
        return tableResult;
    }

    public static String getLargeMultiplicationTable() {
        String tableResult = "";
        int stringLength = 0;
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                //tableResult += "  ";
                stringLength = String.valueOf(i * j).length();
                for(int k = 0; k < 3 - stringLength; k++){
                    tableResult += " ";
                }
                tableResult += (i * j) + " |"; 
            }
            tableResult += "\n";
        }
        return tableResult;
    }

    public static String getMultiplicationTable(int tableSize) {
        String tableResult = "";
        int stringLength = 0;
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                //tableResult += "  ";
                stringLength = String.valueOf(i * j).length();
                for(int k = 0; k < 3 - stringLength; k++){
                    tableResult += " ";
                }
                tableResult += (i * j) + " |"; 
            }
            tableResult += "\n";
        }
        return tableResult;
    }
}