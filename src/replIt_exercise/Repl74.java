package replIt_exercise;

import java.util.Scanner;

public class Repl74 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if(a.contains("alejandro")){
            System.out.println("read this mail");
        }else {
            System.out.println("dont read");
        }
    }
}
