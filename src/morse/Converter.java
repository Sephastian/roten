package morse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Converter {

    // startar med att göra engelska till morse hashmap
    static HashMap<Character, String> engToMorse = new HashMap<>();

    public Converter() {
        // fylla hashmap, använda * istället för . var enklare för att ha unika key/value och för att underlätta vad man vill översätta från
        engToMorse.put('a', "*-");
        engToMorse.put('b', "-***");
        engToMorse.put('c', "-*-*");
        engToMorse.put('d', "-**");
        engToMorse.put('e', "*");
        engToMorse.put('f', "**-*");
        engToMorse.put('g', "--*");
        engToMorse.put('h', "****");
        engToMorse.put('i', "**");
        engToMorse.put('j', "*---");
        engToMorse.put('k', "-*-");
        engToMorse.put('l', "*-**");
        engToMorse.put('m', "--");
        engToMorse.put('n', "-*");
        engToMorse.put('o', "---");
        engToMorse.put('p', "*--*");
        engToMorse.put('q', "--*-");
        engToMorse.put('r', "*-*");
        engToMorse.put('s', "***");
        engToMorse.put('t', "-");
        engToMorse.put('u', "**-");
        engToMorse.put('v', "*-");
        engToMorse.put('w', "*--");
        engToMorse.put('x', "-*-");
        engToMorse.put('y', "-*--");
        engToMorse.put('z', "--**");
        engToMorse.put('1', "*----");
        engToMorse.put('2', "**---");
        engToMorse.put('3', "***--");
        engToMorse.put('4', "****-");
        engToMorse.put('5', "*****");
        engToMorse.put('6', "-****");
        engToMorse.put('7', "--***");
        engToMorse.put('8', "---**");
        engToMorse.put('9', "----*");
        engToMorse.put('0', "-----");
        engToMorse.put('.', "*-*-*-");
        engToMorse.put(',', "--**--");
        engToMorse.put('?', "**--**");
        engToMorse.put(' ', " ");

    }

    public static String getInput(String s) {

        String input = s.toLowerCase(); // gör om inputen till små bokstäver så det passar min hashmap

        if (input.contains("-")) {
            translateMorse(input);

        } else if (input.contains("*")) {
            translateMorse(input);

        } else if (input.matches("[a-zA-Z\\s\\d]+")) {
            translateEnglish(input);
        } else
            System.out.println("Your input is not valid.");

        return input;
        // mitt försök till att skilja vad som är morse eller engelska
        // hade kunnat vara betydligt bättre/säkrare men hade inte tålamod nog efter jag krigade med regex

    }

    public static String translateEnglish(String s) {

        ArrayList<String> translate = new ArrayList<>();  // skapar arraylist för att lägga in avkodningen

        String input = s.toLowerCase();


        int i = 0;

        while (i < input.length()) {
            System.out.print(engToMorse.get(input.charAt(i))); // vill ha utskrift på vad som händer


            translate.add(i, (engToMorse.get(input.charAt(i)))); // lägger in värdet från engToMorse Map
            i++;
        }
        String shipp = "";
        for (String a : translate) {
            shipp += a; // gör om arraylist till en string för att returnera
        }

        return shipp;
    }

    public static String translateMorse(String s) {

        Map<String, Character> morseToEng = new HashMap<>(); // skapar nästa hashmap

        for (Map.Entry<Character, String> entry : engToMorse.entrySet()) { //tar min engelska till morse och vänder
            morseToEng.put(entry.getValue(), entry.getKey());              //på den istället för att skriva ut helt ny hashmap
        }

        String[] code = s.split(" ");  // Splittar för att lägga in i array
        StringBuilder decoded = new StringBuilder();  // Gör en StringBuilder att bygga upp avkodningen
        for (int i = 0; i < code.length; i++) {
            if (morseToEng.containsKey(code[i])) {  // letar efter nyckeln
                decoded.append(morseToEng.get(code[i])); // tar värdet när vi är på rätt nyckel
            } else {
                decoded = new StringBuilder("?"); // kanske kan kallas felhantering? Hittas ingen nyckel blir avkodningen ett ?
            }
        }
        System.out.println(decoded);
       return decoded.toString();


    }
}


