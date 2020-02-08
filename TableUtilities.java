 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int x = 5;
        String result1 = getMultiplicationTable(x);
        return result1;
    }

    public static String getLargeMultiplicationTable() {
        int y = 10;
        String result2 = getMultiplicationTable(y);
        return result2;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int i=1; i <= tableSize; i++) {
            for (int j=1; j <= tableSize; j++) {
                int product = i * j;
                if (product <10)
                {
                    result += "  " + product + " |";
                }
                else if ( product < 100 && product > 9)
                {
                    result += " " + product + " |";
                }
                else
                {
                   result += "" + product + " |"; 
                }
            }
            result += "\n";
            }    
        
        return result;
    }
    
  }

