package org.udemekendrick.hackerrank;

import java.util.Scanner;

public class JavaStringIntroduction {

    public static void stringManipulation(String A, String B) {

//        Step 1: Sum the lengths of A and B
        int totalLength = A.length() + B.length();

//        Step 2: Determine if A is lexicographically larger than B
        String comparisonResult = A.compareTo(B) > 0 ? "Yes" : "No";

//        Capitalize the first letter of A and B
        String capitalizedA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0,1).toUpperCase() + B.substring(1);

//        Print the results
        System.out.println(totalLength);
        System.out.println(comparisonResult);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
