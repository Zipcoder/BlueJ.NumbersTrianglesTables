 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String num = "";
        for(int i = 1; i <= 5 ; i++) {
            for(int j = 1; j <= 5; j++) {
            num += String.format("%3d |", i * j);
     }
     num += "\n";
     }
    return num;
    }

    public static String getLargeMultiplicationTable() {
        String num = "";
        for(int i = 1; i <= 10 ; i++) {
            for(int j = 1; j <= 10; j++) {
            num += String.format("%3d |", i * j);
     }
     num += "\n";
     }
    return num;
    }

    public static String getMultiplicationTable(int tableSize) { 
       String num = "";
        for(int i = 1; i <= tableSize ; i++) {
            for(int j = 1; j <= tableSize; j++) {
            num += String.format("%3d |", i * j);
     }
     num += "\n";
     }
    return num;
    }
}
