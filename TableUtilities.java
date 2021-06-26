 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String multTable = "";
        for (int i = 1; i <=5; i++){
             for (int j = 1; j <= 5; j++){
                multTable += String.format("%3d |", i*j);
    } multTable += "\n";
}return multTable;
}

    public static String getLargeMultiplicationTable() {
        String multTable = "";
        for (int i = 1; i <=10; i++){
             for (int j = 1; j <= 10; j++){
                multTable += String.format("%3d |", i*j);
    } multTable += "\n";
}return multTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        String multTable = "";
        for (int i = 1; i <=tableSize; i++){
             for (int j = 1; j <= tableSize; j++){
                multTable += String.format("%3d |", i*j);
    } multTable += "\n";
}return multTable;
    }
}
