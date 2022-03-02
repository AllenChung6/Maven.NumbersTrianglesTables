package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        String row = "";
        for (int i = 1; i < numberOfRows; i++) {
//            for (int j = 0; j < i; j++) {
//                row += "*";
//                //System.out.println(triangle);
//            }
//            triangle += row + "\n";
            triangle += TriangleUtilities.getRow(i) + "\n";
        }
        return triangle;
    }

    public static String getRow(int width) {
        String rows = "";

        for (int i = 0; i < width; i++) {
            rows += "*";
        }
        return rows.replaceAll("\\s", "");
    }

    public static String getSmallTriangle(int row) {

        return TriangleUtilities.getTriangle(row);
    }

    public static String getLargeTriangle(int row) {

        return TriangleUtilities.getTriangle(row);
    }

}