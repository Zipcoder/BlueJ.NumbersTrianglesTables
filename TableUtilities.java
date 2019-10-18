 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String response = "";
        for (int i = 1; i <= tableSize; i++){
            for (int j = 1; j <= tableSize; j++) {
                response += " ".repeat(3-Integer.toString(i*j).length())+ i*j +" |";
            }
            response += "\n";
        }
        return response;
    }
}
