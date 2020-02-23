package home_exercise;

/*
* String Literal
* String str = "I am hungry";
*
* String Object
* String str = new String("I am hungry");
*
* */


public class StrLiteralStrObject {

    public static void main(String args[])
    {
        // Initialization time for String
        // Literal
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++)
        {
            String s1 = "GeeksForGeeks";
            String s2 = "Welcome";
        }

        long end1 = System.currentTimeMillis();
        long total_time = end1 - start1;

        System.out.println("Time taken to execute"+
                " string literal = " + total_time);

        // Initialization time for String
        // object
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++)
        {
            String s3 = new String("GeeksForGeeks");
            String s4 = new String("Welcome");
        }

        long end2 = System.currentTimeMillis();
        long total_time1 = end2 - start2;

        System.out.println("Time taken to execute"+
                " string object=" + total_time1);
    }
}

