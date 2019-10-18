
/**
 * Write a description of class TestLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestLoops
{
    public static void main(String[] args) {
        
        System.out.println("\n\n\nNEW RUN");
        
        String table = "";
        for (int i = 1; i <= 10; i++){
            table += "\n";
            for (int j = 1; j <= 10; j++){
            table +="  " + j + " |";
            
            }
        }
        System.out.println(table);
        
    }
}
