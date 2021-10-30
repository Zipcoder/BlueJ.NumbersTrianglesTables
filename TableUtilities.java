 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String MultiTable = "";
        for (Integer i = 0; i < tableSize; i++) {
            String RowOfNum = "";
            Integer n = 0;
            for(Integer j = 0; j < tableSize; j++){
            n = n + (i+1);
            if(n < 10) {
                RowOfNum += "  " + n + " |";
            } else if (n > 9 && n < 100) {
                RowOfNum += " " + n + " |";
            } else {
            RowOfNum += n + " |";
        }
        }
            MultiTable += RowOfNum + "\n";
        }
        return MultiTable;
    }
}
