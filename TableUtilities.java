 

public class TableUtilities {
    public static String getSmallMultiplicationTable(int answerTable) {
        String stringNum = "";
        
        
        for (int x = 1; x <= answerTable; x++){
            for(int y = 1; y <= answerTable; y++){
            stringNum = stringNum + String.format("%3d", x*y) + " |";
        }
            stringNum = stringNum + "\n";
        }
        return stringNum;
    }

    public static String getLargeMultiplicationTable() {
        return getSmallMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        return getSmallMultiplicationTable(tableSize);
    }
}
