package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int tableSize) {
        return TableUtilities.getMultiplicationTable(tableSize);
    }

    public static String getLargeMultiplicationTable(int tableSize) {
        return TableUtilities.getMultiplicationTable(tableSize);
    }

    public static String getMultiplicationTable(int tableSize) {
        String print = "";

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                /*print += i * j; */
                print += String.format("%3d |", i*j);
                //System.out.println(print);
            }
            print += "\n";
        }
        return print;
    }
}
