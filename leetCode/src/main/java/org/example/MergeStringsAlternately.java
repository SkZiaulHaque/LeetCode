package org.example;

import java.util.Scanner;

public class MergeStringsAlternately {
    public static void main(String[] args) {

        // needs to take to Strings from user input and
        // then needs to code where a new string will come
        // in that first letter will be from word1 and 2nd letter from word2

        System.out.println("Please write your Strings");

        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();

        System.out.println("The word1 is : " + word1);
        System.out.println("Please write your 2nd String.........");

        String word2 = sc.next();

        System.out.println("Two Strings are : " + word1 + " & " + word2);

        // lets take a StringBuilder for the new String
        // then itirate them while condition is shorter

        StringBuilder sb = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();

        int i = 0;

        while(i<length1 || i<length2) {
            if (i<length1) sb.append(word1.charAt(i));
            if (i<length2) sb.append(word2.charAt(i));
            i++;
        }
        System.out.println("The new merged String is : " + sb.toString());
    }
}
