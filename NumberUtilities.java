


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
        String numberLine = "";
        for (int i = start; i < stop; i++) {
            numberLine += i;

        }
        return numberLine;
    }


    public static String getRange(int start, int stop, int step) {
        String stepNumber = "";
        for (int i = start; i < stop; i += step) {
             stepNumber += i;

        }
        return stepNumber;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        for (int i = start; i < stop; i++) {
             //is i even?
            //if it is even then then record that number in evenNumbers
            if (i%2 == 0) {
                evenNumbers += i;
            }

        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
            //asking for a string of all of the odd numbers between start and stop, noninclusive of stop
        String oddNumbers = "";
        for (int i = start; i < stop; i++) {
             if (i%2 == 1) {
                 oddNumbers += i;
             }

        }
        return oddNumbers;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        //Math.pow(,)
        String expoNumbers = "";
        for (int i = start; i <= stop; i++) {
             //raise to a power
            double num = Math.pow(i,exponent);
            //casts to an int
            int numOne = (int) num;
            //add it to the string
            expoNumbers += numOne;
        }

        return expoNumbers;
    }
}
