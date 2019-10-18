
public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                if(i * j < 10)  table += " "; 
                if(i * j < 100) table += " ";
                table += i*j + " |";
            }
            table += "\n";
        }
        System.out.println(table);
        return table;
    }
}
