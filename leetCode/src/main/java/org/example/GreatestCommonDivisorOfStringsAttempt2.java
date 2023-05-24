package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GreatestCommonDivisorOfStringsAttempt2 {
    public static void main (String[] args) {

        for (int i=0; i<5; i++ )
        {
            System.out.println("Please enter your 1st String");

            Scanner sc = new Scanner(System.in);

            String str1 = sc.next();

            System.out.println("Please enter your 2nd String");

            String str2 = sc.next();

            System.out.println("Two Strings are :: " + str1 + " & " + str2);

            if ((str1 + str2).equals(str2 + str1)) {
                System.out.println("GCD is possible");
            } else {
                System.out.println("GCD is not possible");
            }
            if (str1.equals(str2)) {
                System.out.println("GCD is : " + str1);
            } else if (str1.length() > str2.length()) {
                System.out.println("GCD is : " + str1.substring(str2.length()) ) ;
                // pls see the line number 32... substring syntax is getting wrong.. I am putting wrong I think
            } else if (str2.length() > str1.length()) {
                System.out.println("GCD is : " + str2.substring(str1.length()) );
            }
        }




    }
}
