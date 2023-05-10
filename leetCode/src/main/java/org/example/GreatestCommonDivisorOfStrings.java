package org.example;

import java.util.Scanner;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please put your first String....");
        String a = sc.next();
        System.out.println("Please put your 2nd String");
        String b = sc.next();
        System.out.println("Your strings are : " + a + " & " + b);

        char[] a1 = a.toCharArray();
        char[] b2 = b.toCharArray();

//        System.out.println("a1 length is : " + a1.length);
//        System.out.println("a1 length is : " + b2.length);

        System.out.print("Greatest common divisor of the provided String is : ");

        for (int i=0; i<b2.length; i++) {
            if (b2.length < a1.length ) {
            if (a1[i]%b2[i] == 0) {
                System.out.print(a1[i]);
            }
            }
            else {
                System.out.println("Null");
            }
            if (a1.length < b2.length) {
                if (b2[i]%a1[i] == 0) {
                    System.out.print(b2[i]);
                }
            }

        }
        }

    }
