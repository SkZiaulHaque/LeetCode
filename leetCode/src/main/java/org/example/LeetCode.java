package org.example;

import java.util.Scanner;

/* write a java program to accept an array from user and find sum of all elements in the array */
public class LeetCode {
    public static void main(String[] args) {

        int arraySize=0;
        System.out.println("Enter the size of array");

        Scanner sc = new Scanner(System.in);
        arraySize=sc.nextInt();

        int [] array = new int[arraySize];

        for (int i=0; i<array.length;i++) {
            System.out.println("Enter array elements one by one");
            array[i] = sc.nextInt();
        }

        System.out.print("Your array looks like :: ");

        for (int i=0; i<array.length; i++) {
            System.out.print(" " + array[i]);
        }

        /* now needs to sum of all elements */

        int sumofAll = 0;
        for (int i=0; i<array.length; i++) {
            sumofAll = sumofAll + array[i];
        }
        System.out.println();
        System.out.println("Sum of all elements is :: " + sumofAll);

        /* now will calculate leftSum, rightSum to identify pivot index*/

        int leftSum = 0;
        int rightSum = sumofAll;

        for (int i=0; i<array.length; i++) {
            rightSum = rightSum - array[i];

            if (leftSum == rightSum) {
                System.out.println("Your pivot index is :: " + i + " and value of index is :: " + array[i]);
            }
//            else {
//                System.out.println(-1);
//            }
            leftSum = leftSum + array[i];
        }

        System.out.print("Running Sum of the array is :: "); /* eta vul ache, r ekta loop chalale tobei running sum
        debe else 1st element ta asbe na, next sheet a kore diyechi */
        for (int i=1; i<array.length; i++) {
            array[i] = array[i] + array[i-1];
            System.out.print(" " + array[i]);
        }



    }
}
