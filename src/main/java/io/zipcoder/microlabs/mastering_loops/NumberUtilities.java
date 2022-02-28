package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i=start; i < stop; i++) {
            if(i % 2 ==0)
                 result += i;
        }
        return result;
    }

    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for (int i=start; i < stop; i++) {
            if(i % 2 ==1)
                result += i;
        }
        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange(0,stop,1);
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start,stop,1);
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i=start; i< stop; i= i + step) {
            result += i;
        }
        return result;
    }



    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
