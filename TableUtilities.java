 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {  
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = ""; 
        int num;
        
        for( int row = 1; row <= tableSize; row++){
            for( int times = 1; times <= tableSize; times++){ 
                    num = row * times;
                    result+= String.format("%3d", num) + " |";
                
        }
            result = result + "\n";
        }
        
        return result;   
    }
}
