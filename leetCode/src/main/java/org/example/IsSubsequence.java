package org.example;

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {

        System.out.println("Please enter your String s");

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        System.out.println("Please enter your String t");

        String t = scanner.next();

        System.out.println("Your two strings are ::: " + s + " & " + t);

        if (s.length() == 0) {
            System.out.println("Strings are by default Is Subsequence as one string's lenght is 0 ");
        }
        int j=0;

        for (int i=0; i<t.length();i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            if (j>=s.length()) {
                System.out.println("Strings are in Is Subsequence");
            }
            else
            {
                System.out.println("Strings are not in Is Subsequence");
            }
        }
    }
}
