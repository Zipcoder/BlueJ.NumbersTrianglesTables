
public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String string = "";
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                String cell = String.format("%3s |",i * j);
                string = string + cell;
            }
            string = string + "\n";
        } 
        return string;
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                String cell = String.format("%3s |",i * j);
                sb.append(cell);
            }
            sb.append("\n");
        } 
        return sb.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                String cell = String.format("%3s |",i * j);
                sb.append(cell);
            }
            sb.append("\n");
        } 
        return sb.toString();
    }
}
