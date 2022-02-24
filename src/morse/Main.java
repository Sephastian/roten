package morse;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Converter convert = new Converter();

        Scanner scan = new Scanner(System.in);


        System.out.println("Write what you want translated");

        String s = scan.nextLine();

        convert.getInput(s);

        // egentligen inte något mer än starten på programmet.

    }
}




