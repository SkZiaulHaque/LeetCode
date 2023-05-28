package org.example;

import java.util.Scanner;

public class GreatestCommonDivisorOfStringsAttempt2 {



    public static void gcdOfStrings(String str1, String str2) {
        System.out.println(str1 + str2);
        return;
    }
    public static void main (String[] args) {
        for (int i=0; i<5; i++) {

        System.out.println("Please enter your 1st String");

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        System.out.println("Please enter your 2nd String");
        String str2 = sc.next();

        gcdOfStrings("your input is " + str1 + " & ", str2);

        System.out.println("**************************************************");


        if ((str1 + str2).equals(str2 + str1)) {
            System.out.println("GCD is possible");
            System.out.println("**************************************************");
        } else {
            System.out.println("GCD is not possible");
            System.out.println("**************************************************");
        }
        if (str1.equals(str2)) {
            System.out.println("GCD is : " + str1);
            System.out.println("**************************************************");
        }
        if (str1.length() > str2.length()) {
            gcdOfStrings("GCD is :: " + str1.substring(str2.length()), "");
            System.out.println("**************************************************");
        } else {
            gcdOfStrings("GCD is :: " + str2.substring(str1.length()), "");
            System.out.println("**************************************************");
        }
            System.out.println("Program will for next input.....");
        System.out.println("**************************************************");
    }


    }
}
