 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(5);
    }
    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String catty = "";
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                catty = catty + String.format("%3d |",i*j);
            }
            catty = catty + "\n";
        }
        return catty;
    }
}
