 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String badBoy = "";
        
        for(int i=1; i<=5; i++){ 
            
            for(int j=1; j<=5; j++){
                 int d = i * j;
                 String f = String.valueOf(d);
                 String o = "  ";
                 if ( f.length() == 2) {
                     o = " ";
                    
                 } else if ( f.length() == 3) {
                      o = ""; 
                 }
                System.out.print(badBoy += o + i*j + " |");
            }  
            badBoy += "\n";
        
        }
   
        return badBoy;
    }
        
        
    public static String getLargeMultiplicationTable() {
        String badBoy = "";
        
        for(int i=1; i<=10; i++){ 
            
            for(int j=1; j<=10; j++){
                 int d = i * j;
                 String f = String.valueOf(d);
                 String o = "  ";
                 if ( f.length() == 2) {
                     o = " ";
                    
                 } else if ( f.length() == 3) {
                      o = ""; 
                 }
                System.out.print(badBoy += o + i*j + " |");
            }  
            badBoy += "\n";
        
        }
   
        return badBoy;
    }

    public static String getMultiplicationTable(int tableSize) {
        String badBoy = "";
        
        for(int i=1; i<= tableSize; i++){ 
            
            for(int j=1; j<= tableSize; j++){
                 int d = i * j;
                 String f = String.valueOf(d);
                 String o = "  ";
                 if ( f.length() == 2) {
                     o = " ";
                    
                 } else if ( f.length() == 3) {
                      o = ""; 
                 }
                System.out.print(badBoy += o + i*j + " |");
            }  
            badBoy += "\n";
        
        }
   
        return badBoy;
        }
        
    }

