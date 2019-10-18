 

public class TableUtilities {

    public static String getSmallMultiplicationTable() {
        
        String result = getMultiplicationTable(5);
        return result;
    }

    public static String getLargeMultiplicationTable() {
        
        String result = getMultiplicationTable(10);
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        
        String result = "";
        int row = 1;
        int column = 1;
        
        while (column <= tableSize && row <= tableSize){
            
            String temp = Integer.toString(column * row); 
            result += " ".repeat(3 - temp.length()) + temp + " |";
            
            if (column == tableSize){
            
                result += "\n";
                row++;
                column = 1;
            }
            else{
                column++;
            }
            
        }    
        return result;
    }
}
