package day35_wrapper_intro;

public class task1 {

    public static void main(String[] args) {

        /*
        String sentence
	    = "I bought 3 tomato and the price was 3.14 each"
        // How much is your final checkout price
        // The count is always 3rd word
        // The price is always at 2nd word from the last
        */

       // LOGIC - split by space, parse count and price, do calculation.

       //                  0    1   2   3     4   5    6    7   8    9
        String sentence = "I bought 3 tomato and the price was 3.14 each";


        String[] allWords = sentence.split(" ");
        int count = Integer.parseInt(allWords[2]);
        Double price = Double.parseDouble(allWords[allWords.length-2]);

        System.out.println("total is : "+ count * price);






    }
}
