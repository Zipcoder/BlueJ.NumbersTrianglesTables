 

public class TableUtilities {
public static String getSmallMultiplicationTable() {
        String table = "";
        
        for(int i = 1; i<=8; i++){
            for(int j = 1; j<=5; j++) {
                if (j*i < 10) {
              table = table + (("  " + (j * i)) + " |");   
            } else {
                table = table + ((" " + (j * i)) + " |");;
            }
             
        }
    table = table + "\n";
}    
        return table;
    }

    
    
    public static String getLargeMultiplicationTable() {
        String table = "";
        
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=10; j++) {
                if (j*i < 10) {
              table = table + (("  " + (j * i)) + " |");   
            } else if(j*i < 100){
                table = table + ((" " + (j * i)) + " |");
            } else {
                table = table + (("" + (j * i)) + " |");
            }
             
        }
    
    table = table + "\n";
}    
    return table;
}

    public static String getMultiplicationTable(int tableSize) {
                String table = "";
        
        for(int i = 1; i<=tableSize; i++){
            for(int j = 1; j<=tableSize; j++) {
                if (j*i < 10) {
              table = table + (("  " + (j * i)) + " |");   
            } else if(j*i < 100){
                table = table + ((" " + (j * i)) + " |");
            } else {
                table = table + (("" + (j * i)) + " |");
            }
             
        }
    
    table = table + "\n";
}    
    return table;
    }
}
