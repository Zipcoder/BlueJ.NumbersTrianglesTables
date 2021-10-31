 public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String outcome = "";
        String convert;
        int multiple;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                multiple = i * j;
                convert = Integer.toString(multiple);

                if (multiple >= 10) {
                    if (j == 5) {
                        outcome += " " + convert + " |\n";
                    } else {
                        outcome += " " + convert + " |";
                    }
                } else {
                    if (j == 5) {
                        outcome += "  " + convert + " |\n";
                    } else {
                        outcome += "  " + convert + " |";
                    }
                }
            }
        }
        
        return outcome;
    }

    public static String getLargeMultiplicationTable() {
        String outcome = "";
        String convert;
        int multiple;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                multiple = i * j;
                convert = Integer.toString(multiple);

                if (multiple >= 100) {
                    if (j == 10) {
                        outcome += "" + convert + " |\n";
                    } else {
                        outcome += "" + convert + " |";
                    }
                } else if (multiple >= 10){
                    if (j == 10) {
                        outcome += " " + convert + " |\n";
                    } else {
                        outcome += " " + convert + " |";
                    }
                } else {
                    if (j == 10) {
                        outcome += "  " + convert + " |\n";
                    } else {
                        outcome += "  " + convert + " |";
                    }
                }
            }
        }
        
        return outcome;
    }

    public static String getMultiplicationTable(int tableSize) {
        String outcome = "";
        String convert;
        int multiple;

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                multiple = i * j;
                convert = Integer.toString(multiple);

                if (multiple >= 100) {
                    if (j == tableSize) {
                        outcome += "" + convert + " |\n";
                    } else {
                        outcome += "" + convert + " |";
                    }
                } else if (multiple >= 10){
                    if (j == tableSize) {
                        outcome += " " + convert + " |\n";
                    } else {
                        outcome += " " + convert + " |";
                    }
                } else {
                    if (j == tableSize) {
                        outcome += "  " + convert + " |\n";
                    } else {
                        outcome += "  " + convert + " |";
                    }
                }
            }
        }
        
        return outcome;
    }
}