 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String small = "";
        for(int x = 1; x <= 5; x++){
        for(int i = 1; i <= 5; i++){
            small += String.format("%3d |", x * i);
        }
        small += "\n";
    }
     return small;
    }

    public static String getLargeMultiplicationTable() {
        String large = "";
        for(int x = 1; x <= 10; x++){
        for(int i = 1; i <= 10; i++){
            large += String.format("%3d |", x * i);
        }
        large += "\n";
    }
        return large;
    }

    public static String getMultiplicationTable(int tableSize) {
        String n = "";
        for(int x = 1; x <= tableSize; x++){
        for(int i = 1; i <= tableSize; i++){
            n += String.format("%3d |", x * i);
        }
        n += "\n";
    }
      return n;
    }
}
