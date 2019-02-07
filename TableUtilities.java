 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String container = getMultiplicationTable(5);
        return container;
    }

    public static String getLargeMultiplicationTable() {
        String container = getMultiplicationTable(10);
        return container;
    }

    public static String getMultiplicationTable(int tableSize) {
        System.out.print('\u000C');
        String container = "";
        for( int j = 1; j <= tableSize; j++ ){
            for( int i = 1; i <= tableSize; i++ ){
                container += (String.format("%3d |" , i * j));
            }
            container += "\n";
        }
        return container;
    }
}
