


public class NumberUtilities {

    public static String getRange(int stop) {
        String SmallRange = "";
        for (Integer i = 0; i < stop; i++) {
            SmallRange = SmallRange + i.toString();
        }
        return SmallRange;
    }

    public static String getRange(int start, int stop) {
        String StartNumber = "";
        for (Integer i = start; i < stop; i++) {
            StartNumber = StartNumber + i.toString();
        }
        return StartNumber;
    }


    public static String getRange(int start, int stop, int step) {
        String OneStepTwoStep = "";
        for (Integer i = start; i < stop; i += step) {
            OneStepTwoStep = OneStepTwoStep + i.toString();
        }
        return OneStepTwoStep;
    }

    public static String getEvenNumbers(int start, int stop) {
        String EvenStep = "";
        if(start%2 == 0) {
            for (Integer i = start; i < stop; i += 2) {
                EvenStep = EvenStep + i.toString();
            }
        } else {
            start+=1;
            for (Integer i = start; i < stop; i += 2) {
                EvenStep = EvenStep + i.toString();
            }
        }
        return EvenStep;
    }


    public static String getOddNumbers(int start, int stop) {
        String OddStep = "";
        if(start%2 > 0) {
            for (Integer i = start; i < stop; i+=2) {
                OddStep = OddStep + i.toString();
            }
        } else {
            start+=1;
            for (Integer i = start; i < stop; i+=2) {
                OddStep = OddStep + i.toString();
            }
        }
        return OddStep;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String SquareCube = "";
        for (Integer i = start; i <= stop; i++) {
            Double d = Math.pow(i, exponent);
            String str = d.toString();
            SquareCube = SquareCube + str.substring(0, str.length()-2);
        }
        return SquareCube;
    }
}
