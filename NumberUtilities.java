
public class NumberUtilities { 
    public static String getRange(int stop) {
        String range = "";
        for(int i = 0; i < stop; i++){
            String nextNum = Integer.toString(i);
            range += nextNum;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(int i = start; i < stop; i++){
            String nextNum = Integer.toString(i);
            range += nextNum;
        }
        return range;
    }

    public static String getRange(int start, int stop, int step) {
        String range = "";
        for(int i = start; i < stop; i+=step) {
            String nextNum = Integer.toString(i);
            range += nextNum;
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenNums = "";
        if(start % 2 != 0) {
            start += 1;
        }
        for(int i = start; i < stop; i += 2) {
            String nextNum = Integer.toString(i);
            evenNums += nextNum; 
        }
        return evenNums;
    }

    public static String getOddNumbers(int start, int stop) {
        String oddNums = "";
        if(start % 2 == 0) {
            start += 1;
        }
        for(int i = start; i < stop; i += 2) {
            String nextNum = Integer.toString(i);
            oddNums += nextNum; 
        }
        return oddNums;
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        String expNumsStr = "";
        String nextNumStr;
        for(int i = start; i <= stop; i++) {
            
            nextNumStr = Integer.toString((int) Math.pow(i,exponent));
            expNumsStr += nextNumStr;
        }
        return expNumsStr;
    }
}

