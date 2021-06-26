 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String t = "";
        int m;
        
        for(int i = 1; i <= tableSize; i++){
            for (int j = 1; j <= tableSize; j++ ){
                m = i * j;
                t += String.format("%3d |", m);
            }
            t += "\n";
        }
        return t;
    }
}
