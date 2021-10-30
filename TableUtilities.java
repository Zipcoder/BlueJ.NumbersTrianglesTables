

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String multiplicationTable = "";

        for (int i = 1; i <= tableSize; i++) {

            for (int j = 1; j <= tableSize; j++) {
                int iJ = i * j;
                multiplicationTable = multiplicationTable + String.format("%3d", iJ) + " |";

            }
            multiplicationTable = multiplicationTable + "\n";
        }
        return multiplicationTable;
    }
}
