 

public class TableUtilities {
    public static String getSpacesBeforeNumbers(int numToCheck) {
        int lengthOfNum = String.valueOf(numToCheck).length();
        String spacer = "";
        for (int i = 0; i < (3 - lengthOfNum); i++) {
            spacer += " ";
        }
        return spacer;
    }
    public static String getSmallMultiplicationTable() {
        String acc = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int numVal = j * i;
                acc += getSpacesBeforeNumbers(numVal) + String.valueOf(numVal) + " |";
            }
            acc += "\n";
        }
        return acc;
    }

    public static String getLargeMultiplicationTable() {
        String acc = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int numVal = j * i;
                acc += getSpacesBeforeNumbers(numVal) + String.valueOf(numVal) + " |";
            }
            acc += "\n";
        }
        return acc;
    }

    public static String getMultiplicationTable(int tableSize) {
        String acc = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                int numVal = j * i;
                acc += getSpacesBeforeNumbers(numVal) + String.valueOf(numVal) + " |";
            }
            acc += "\n";
        }
        return acc;
    }
}
