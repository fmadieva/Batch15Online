package day42;

public class MovieAction {

    public static void main(String[] args) {

        //Movie m1 = new Movie();
       // System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Joker", 2.2, "Drama");
        System.out.println("m2 = " + m2);

        Movie m3 = new Movie("Frozen", 1.5, "Family");
        Movie m4 = new Movie("Pursuit of Happiness", 2.0, "Drama");
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);


        // I want to get the name of M@ separately so I can do some stuff
        //System.out.println(m2.name);
        // I cannot access the field directly because it's private
        // i need a getter method to access
        System.out.println(m2.getName());

    }
}
