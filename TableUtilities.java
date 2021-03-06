 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                    sb = sb.append(" " + (i*j));
                    sb = sb.append(" |");
            }
            sb = sb.append("\n");
        }
        return sb.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                    sb = sb.append(" " + (i*j));
                    sb = sb.append(" |");
            }
            sb = sb.append("\n");
        }
        return sb.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                    sb = sb.append(" " + (i*j));
                                sb = sb.append(" |");
            }
            sb = sb.append("\n");

        }
        return sb.toString();
    }
}
