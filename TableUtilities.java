 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String ans = "";
        int tableSize =5;
        
        for(int i=1;i<=tableSize;i++){
           for(int j=1;j<=tableSize;j++){
               if(j!=tableSize){ans += String.format("%3d |",i*j);}
               else {ans += String.format("%3d |\n",i*j);}
            }
        }
        return ans;
    }

    public static String getLargeMultiplicationTable() {
     return getMultiplicationTable(10);
     
    }

    public static String getMultiplicationTable(int tableSize) {
        String ans = "";
        for(int i=1;i<=tableSize;i++){
           for(int j=1;j<=tableSize;j++){
               if(j!=tableSize){ans += String.format("%3d |",i*j);}
               else {ans += String.format("%3d |\n",i*j);}
            }
        }
        return ans;
    }
}
