 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table ="";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                    table = sb.append(i*j).toString();
                    table = sb.append(" |").toString();
            }
            table = sb.append("\n").toString();
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table="";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                    table = sb.append(i*j).toString();
                    table = sb.append(" |").toString();
            }
            table = sb.append("\n").toString();
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table ="";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                    table = sb.append(" " + i*j).toString();
                                table = sb.append(" |").toString();
            }
            table = sb.append("\n").toString();

        }
        return table;
    }
}
