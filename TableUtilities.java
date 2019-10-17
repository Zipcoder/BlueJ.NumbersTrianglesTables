
public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize;j++){
                if(i < 10){
                    sb.append("  " + (i * j) + " |");
                } else if (10 <= (i * j) && (i * j) < 100){
                    sb.append(" " + i + " |");
                } else {
                    sb.append((i * j) + " |");
                }
            /*    if(j == tableSize){
                    sb.append("  " + i * j + " |");
                } else if(j == 1){
                    sb.append("  " + i * j + " |");
            } else {
                sb.append(" " + i * j + " | ");
            }*/
        }
        sb.append("\n");
    }
    return sb.toString();
}
}    