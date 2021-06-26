 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String x = "";
        for(int i = 1; i <= 5; i++){
            
        
        for(int j = 1; j <= 5; j++){
            int g = i* j;
            String a = String.valueOf(g);
            String m = "  ";
            if (a.length() == 2) {
                m = " ";
            }else if(a.length() == 3){
                m = "";
            }
                
            
            System.out.print(x += m + i*j + " |");
        }
        x += "\n";
        
    }
    return x;
}
    
    public static String getLargeMultiplicationTable() {
       String x = "";
        for(int i = 1; i <= 10; i++){
            
        
        for(int j = 1; j <= 10; j++){
            int g = i* j;
            String a = String.valueOf(g);
            String m = "  ";
            if (a.length() == 2) {
                m = " ";
            }else if(a.length() == 3){
                m = "";
            }
                
            
            System.out.print(x += m + i*j + " |");
        }
        x += "\n";
        
    }
    return x;
}

    public static String getMultiplicationTable(int tableSize) {
        String x = "";
        for(int i = 1; i <= tableSize; i++){
            
        
        for(int j = 1; j <= tableSize; j++){
            int g = i* j;
            String a = String.valueOf(g);
            String m = "  ";
            if (a.length() == 2) {
                m = " ";
            }else if(a.length() == 3){
                m = "";
            }
                
            
            System.out.print(x += m + i*j + " |");
        }
        x += "\n";
        
    }
    return x;
}
}
