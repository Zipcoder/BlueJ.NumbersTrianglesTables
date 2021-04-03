 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int i, j;
        String output = "";
        for (i = 1; i <= 5; i++) {
            String middleMan = "";
            for (j = 1; j <= 5; j++) {
                middleMan += " " + (j*i) + " |";
            }
            middleMan += "\n";
            output += middleMan;
        }
        System.out.print(output);
        return output;
    }

    public static String getLargeMultiplicationTable() {
        int i, j;
        String output = "";
        for (i = 1; i <= 10; i++) {
            String middleMan = "";
            for (j = 1; j <= 10; j++) {
                middleMan += " " + (j*i) + " |";
            }
            middleMan += "\n";
            output += middleMan;
        }
        System.out.print(output);
        return output;
    }

    public static String getMultiplicationTable(int tableSize) {
        int i, j;
        String output = "";
        for (i = 1; i <= tableSize; i++) {
            String middleMan = "";
            for (j = 1; j <= tableSize; j++) {
                middleMan += " " + (j*i) + " |";
            }
            middleMan += "\n";
            output += middleMan;
        }
        System.out.print(output);
        return output;
    }
}
