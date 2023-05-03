package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GreatestCommonDivisorOfIntegers {
    public static void main(String[] args) {
        // first trying to do with integer then will try for Strings

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your 1st integer");

        int firstInt = sc.nextInt();
        System.out.println("Please write your 2nd integer");

        int secondInt = sc.nextInt();

        System.out.println("1st integer is : " + firstInt + " & 2nd integer is : " + secondInt);

        int i=0;
        ArrayList<Integer> list1 = new ArrayList<>();
        for (i=1; i<=firstInt; i++) {
            if (firstInt%i==0)
                list1.add(i);
        }

        int j=0;
        ArrayList list2 = new ArrayList<>();
        for (j=1; j<=secondInt; j++) {
            if (secondInt%j==0)
                list2.add(j);
        }

        System.out.println("Divisors of 1st integer : " + list1);
        System.out.println("Divisors of 2nd integer : " + list2);

        list1.retainAll(list2);

        System.out.println("The common elements are : " + list1);
        System.out.println("The biggest element is now : " + Collections.max(list1) +
                " & this is the Gretest Common Divisor");
    }
}
