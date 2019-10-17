 

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
                response += new String(new char[3-Integer.toString(i*j).length()]).replace("\0", " ")+ i*j +" |";
            }
            response += "\n";
        }
        return response;
    }
}
