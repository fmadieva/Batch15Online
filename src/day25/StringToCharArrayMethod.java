package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args){



            // pick up your own name and turn in into char array
            // and use for each loop to loop over them
            // optionally count how many a you have in your name

            String name = "Anastasiya";
            // turn this into charArray using toCharArray() method of String
            // toCharArray() is a method of String that turn string into char array
            char[] allCharsInName = name.toCharArray();

            for (char eachChar : allCharsInName) {
                System.out.println("eachChar = " + eachChar);
            }

            // now count how many a we have
            int count = 0;
            for (char eachChar : allCharsInName) {

                if (eachChar == 'a') {
                    ++count;
                }

            }
            System.out.println("count = " + count);

            //What if you want to sort all characters of your  name in alphabetical order?
        Arrays.sort(allCharsInName);
        System.out.println(Arrays.toString(allCharsInName));

        }





    }

