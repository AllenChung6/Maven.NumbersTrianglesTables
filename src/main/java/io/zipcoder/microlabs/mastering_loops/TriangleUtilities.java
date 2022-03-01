package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        /*String pyramid = "";
        String star = "*";
        for (int i=0; i < numberOfRows; i++)
            for (int j=0; j< numberOfRows; i++)
                pyramid += i;
       return pyramid; */
        return null;

    }

    public static String getRow(int width) {
        String rows = " ";

        for (int i = 0; i < width; i++) {
            rows += "*";
        }
        return rows.replaceAll("\\s", "");
    }

    public static String getSmallTriangle() {
        String result = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i;  j++) {
                result += "*";
            }
        }
        return result;
    }

    public static String getLargeTriangle() {
        return null;
    }

}