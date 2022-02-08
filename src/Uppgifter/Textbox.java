package Uppgifter;

import java.util.Scanner;

public class Textbox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv något!");
        Countbox myText = new Countbox();

        String nextText = scan.nextLine();

        while (myText.isAddStop(nextText)) {



            myText.addRows();
            myText.countCharacter(nextText);
            nextText = scan.nextLine();

        }


        System.out.println("Antal rader: " + myText.getRowCount());
        System.out.println("Antal tecken: " + myText.getCharacterCount());
    }
}
