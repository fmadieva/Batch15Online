package day14;

public class StringMethodCharAt {

    public static void main(String[] args){

        String aName = "Arya";
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);

        // If you want to add space in between
        // A r y a
        System.out.println( c1 + " " + c2 + " " + c3 + " " +c4  );





        System.out.println("-------------------");

        String name = "Fariza";

        System.out.println( name.charAt(0));
        System.out.println( name.charAt(1));
        System.out.println( name.charAt(2));
        System.out.println( name.charAt(3));
        System.out.println( name.charAt(4));
        System.out.println( name.charAt(5));

        //System.out.println( name.charAt(6)); gives an error because there is no 6 letter




    }
}
