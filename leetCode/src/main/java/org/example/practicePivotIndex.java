package org.example;

import java.util.Scanner;

public class practicePivotIndex {

    public static void main(String[] args) {

        /* First will take array from user and will find the pivot index */

        int arraySize = 0;
        System.out.println("Please enter the size of the Array...");
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();

        int array [] = new int[arraySize];

        System.out.println("Please enter array elements one after another....");
        for (int i=0; i<array.length; i++) {
            System.out.println("Enter next index element...");
            array[i] = scanner.nextInt();
        }

        System.out.print("Your array looks like :: ");

        for(int i=0; i<array.length;i++){
            System.out.print(" " + array[i]);
        }

        /* now will try to have sum of all elements*/

        int sumofAll = 0;

        for (int i=0; i<array.length; i++) {
            sumofAll= sumofAll + array[i];
        }
        System.out.println();
        System.out.println("Sum of all element is :: " + sumofAll);

        /* now will try to calculate leftSum, rightSum to find the pivot index...*/

        int leftSum = 0;
        int rightSum = sumofAll;

        for (int i = 0; i<array.length; i++) {
            rightSum = rightSum - array[i];


            if (leftSum == rightSum) {
                System.out.println("Your pivot index is :: " + i + " & the value of pivot index is :: " + array[i]);
            }

            leftSum = leftSum + array[i];
        }

        System.out.print("Running sum of the array is :: ");
        for (int i=1; i<array.length; i++) {
            array[i] = array[i] + array[i-1];
        }
        for (int i=0; i<array.length; i++) {
            System.out.print(" " + array[i]);
        }

    }
}
