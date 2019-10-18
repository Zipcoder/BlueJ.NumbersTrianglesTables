

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }




    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String outcome = "";
        for(int i = 1; i <= tableSize; i++){
            for(int y = 1; y <= tableSize; y++) {  
                if(i * y < 10){
                    outcome += "  " + i * y + " |";
                }
                else if(i * y < 100){
                    outcome += " " + i * y + " |";
                }
                else{
                    outcome += "" + i * y + " |";
                }
              
            }
            outcome += "\n";
        }
       System.out.println(outcome);
       return outcome;
    }
}
