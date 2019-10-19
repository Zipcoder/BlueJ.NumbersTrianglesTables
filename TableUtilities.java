 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        int large = 5;
        result = getMultiplicationTable(large);
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        int large = 10;
        result = getMultiplicationTable(large);
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                result += String.format("%3d |", i*j);
            }
            result += "\n";
        }
        return result;
    }
}
