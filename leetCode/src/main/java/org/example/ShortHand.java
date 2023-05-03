package org.example;

/*
// A shorthand notation exists that changes the word "internationalization" into "i18n" and
//"localization" into "l10n".
//That is, the first and last letters remain, but the middle letters are substituted with a
count of the missing letters.
//Write a function to return this shorthand notation for an arbitrary word.
//Example: “Candidate” will become “c7e”; "Prathap" will become "p5p"
*/


import java.util.Scanner;


public class ShortHand {
    public static void main(String[] args) {

        System.out.println("please let me know how many shorthand notation you need**********");
        Scanner scanner = new Scanner(System.in);
        int notationNeeds = scanner.nextInt();


        for (int i=0;i<notationNeeds; i++) {

            System.out.println("Please give your string input ********************");

            Scanner sc = new Scanner(System.in);

            String userInput = sc.next();


            System.out.println("Your given string is :: " + userInput);

            char[] user = userInput.toCharArray();

            System.out.println("As per the instruction 1st & last letter will be printed and " +
                    "middle letters will printed as numbers of letters in int");

            System.out.println("So as per instruction shorthand notaion will be : " +
                    user[0] + (user.length - 2) + user[user.length - 1]);

        }




    }
}
