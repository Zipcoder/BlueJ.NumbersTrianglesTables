
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
                int product = (i * j);
                sb.append(String.format("%3d |",product));
                
                /*if(i < 10){
                    sb.append("  " + (i * j) + " |");
                } else if (10 <= j && j < 100){
                    sb.append(" " + (i * j) + " |");
                } else {
                    sb.append((i * j) + " |");
                }*/

        }
        sb.append("\n");
    }
    return sb.toString();
}
}    