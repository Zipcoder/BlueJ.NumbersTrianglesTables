 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String s= getMultiplicationTable(5); 
        return s;
    }
    

    public static String getLargeMultiplicationTable() {
        String s= getMultiplicationTable(10);
        return s;
    }

    public static String getMultiplicationTable(int tableSize) {
        String s="";  
        for(int j=1;j<=tableSize;j++){
           for(int i=1;i<=tableSize;i++){
               int k = j * i;
                   if ((k > 9) & ( k < 100 )){
                s = s + " " + k +" |";
            }
            else if ( k < 10) 
            {
                s = s + "  " + k +" |";
            }
            else
            {
                s = s + k +" |";
            }
        }
             s = s + "\n"; 
        }
      
        return s;
    }
}
