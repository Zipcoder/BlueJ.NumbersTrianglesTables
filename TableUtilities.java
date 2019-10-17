 

public class TableUtilities {
    
    public static String getRow(int length, int tableSize) {
    
        String result = "";    
        for (int i = 1; i <= tableSize; i++){
            
        String temp = Integer.toString(i * length);   
        result = result + " ".repeat(3 - temp.length())+ temp + " |";
    }
        
        result =result + "\n";
        return result;
    }    
 
    public static String getSmallMultiplicationTable() {
        
        String result = "";
        
        for(int i = 1;i <= 5; i++){
        
            //result += ;
            
        }
        
        return result;
    }

    public static String getLargeMultiplicationTable() {
        
        String result = "";
        
        for(int i = 1;i <= 5; i++){
        
            //result += ;
            
        }
        
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        
        String result = "";
        
        for(int i = 1;i <= tableSize; i++){
        
            result = result + getRow(i, tableSize);//result += ;
            
        }
        System.out.println(result);
        return result;
    }
}
