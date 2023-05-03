package org.example;

/* // Now imagine that we only want to replace a single character with the number "1",
//but We want all different combinations. So, for the word "food", your function should
// return a list ["1ood", "f1od", "fo1d", "foo1"]. Write this function."

//PART
// Now let's generalize your solution in PART2 to return all the different combinations
for all the different substitution values. So, for the word "food", your function should
return a list ["1ood", "f1od", "fo1d", "foo1", "2od", "f2d", "fo2", "3d", "f3", "4"]
* */


import java.util.ArrayList;
import java.util.Scanner;

public class Monjure {
    public static void main(String[] args) {
        // A string is given
        // needs to change each char by 1
        // itirate each of the char of the string

        System.out.println("Please enter your string *****************");

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println("Your string is : " + input);

        System.out.println("Your results will be the following :: ***************");

        ArrayList<String> arrayList = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char[] c = input.toCharArray();
            c[i] = '1';

            arrayList.add(String.valueOf(c));

        }
        for (int i = 0; i < input.length(); i++) {
            char[] c = input.toCharArray();
            c[i] = '2';

            arrayList.add(String.valueOf(c).substring(+ '2' + 2 ));

        }

        System.out.println(arrayList);



    }
}
