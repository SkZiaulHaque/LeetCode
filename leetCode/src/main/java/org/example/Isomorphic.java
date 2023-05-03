package org.example;

import java.util.HashMap;
import java.util.Scanner;


public class Isomorphic {
    public static void main(String[] args) {

        System.out.println("Please enter string s");

        Scanner sc = new Scanner(System.in);

        String s = null;
        s = sc.next();

        System.out.println("Please enter string t (TO BE ISOMORPHIC NUMBERS OF CHAR MUST BE SAME AS IN s");

        String t = null;
        t = sc.next();

        System.out.print("s string characters are :: " + s);
        System.out.println();
        System.out.print("t string characters are :: " + t);

        if (s.length() != t.length()) {
            System.out.println("Provided strings are not isomorphic");
        }

        int [] a = new int[s.length()];
        int [] b = new int[t.length()];

        for (int i=0; i<s.length(); i++) {

            if (a[s.charAt(i)] != b[t.charAt(i)])
                System.out.println("Provided strings are not isomorphic");

            else {
                System.out.println("Provided strings are isomorphic");
            }

            a[s.charAt(i)] = i+1;
            b[t.charAt(i)] = i+1;
        }




    }
}
