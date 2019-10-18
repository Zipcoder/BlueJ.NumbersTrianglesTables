 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String ans = "";
        for(int i=0;i<numberOfStars;i++){
           ans +="*";
        }
        return ans;
    }
    
    public static String getTriangle(int numberOfRows) {
        String ans = "";
        for(int i=1;i<=numberOfRows;i++){
           for(int j=1;j<=i;j++){
               if(j!=i){ans += "*";}
               else {ans += "*\n";}
            }
        }
        return ans;
    }


    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
