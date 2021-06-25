 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= 5; x++) {
                int b = i * x;
                String z = String.valueOf(b);
                String space = "  ";
                if (z.length() == 2) {
                    space = " ";
                }
                table += space + b + " |";
            }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        for (int i = 1; i <= 10; i++) {
            for (int x = 1; x <= 10; x++) {
                int b = i * x;
                String z = String.valueOf(b);
                String space = "  ";
                if (z.length() == 2) {
                    space = " ";
                } else if (z.length() == 3){
                    space = "";
                }
                table += space + b + " |";
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int x = 1; x <= tableSize; x++) {
                int b = i * x;
                String z = String.valueOf(b);
                String space = "  ";
                if (z.length() == 2) {
                    space = " ";
                } else if (z.length() == 3){
                    space = "";
                }
                table += space + b + " |";
            }
            table += "\n";
        }
        return table;
    }
}
