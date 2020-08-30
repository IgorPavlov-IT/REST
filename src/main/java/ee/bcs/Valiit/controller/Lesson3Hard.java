package ee.bcs.Valiit.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

// Enne kui seda tegema hakkad tee ära Lesson 2 (välja arvatud ülesanded 6, 8, 9)
public class Lesson3Hard {

    public static void main(String[] args) {

        //System.out.println(evenFiboSum(20));
        System.out.println(morseCode("tallinn"));
        randomGame();
    }

    // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x
    // See on Exercise 1.
    public static int evenFiboSum(int x) {
        int fiboyleelmine = 2;
        int fiboeelmine = 3;
        int fibo = 0;
        int fibosum = 0;
        if (x < 3) {
            return 0;
        } else if (x == 3) {
            return 1;
        } else if (x > 3) {

            for (int i = 3; i < x; i++) {
                fibo = fiboeelmine + fiboyleelmine;
                fiboyleelmine = fiboeelmine;
                fiboeelmine = fibo;
                if (fibo % 2 == 0) {
                    fibosum = fibosum + fibo;
                }

            }
            return fibosum;
        } else {
            return 0;

        }


    }


    // TODO kirjuta mäng mis võtab suvalise numbri 0-100, mille kasutaja peab ära arvama
    // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
    // ja kasutaja peab saama uuesti arvata
    // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks

    public static int randomGame() {
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Palun arvake ära arv 1st 100ni: ");
        int j = scan1.nextInt();
        int counter = 0;
        if (j == i) {
            System.out.println("Arvasite õigesti! Õige arv oli: " + i);
            System.out.println("Teie arvasite ära esimese korraga, suurepärane!");
        } else {
            while (j != i) {
                if (j > i) {
                    counter++;
                    System.out.println("Pakkusite üle, proovige uuesti!");
                     j = scan1.nextInt();

                } else if (j< i){
                    counter++;
                    System.out.println("Pakkusite liiga vähe, proovige uuesti!");
                    j = scan1.nextInt();

                }
            }
            counter++;
            System.out.println("Arvasite õigesti! Õige arv oli: " + i);
            System.out.println("Teil kulus " + counter + "katset");
        }
        return counter;
    }
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Excercise 3 -            Kasuta sümboleid . ja -

        public static StringBuilder morseCode (String textToMorse){

            StringBuilder message = new StringBuilder();
            Map<String, String> morseList = new HashMap<>();
            morseList.put("a", ".-");
            morseList.put("b", "-...");
            morseList.put("c", "-.-.");
            morseList.put("d", "-..");
            morseList.put("e", ".");
            morseList.put("f", "..-.");
            morseList.put("g", "--.");
            morseList.put("h", "....");
            morseList.put("i", "..");
            morseList.put("j", ".---");
            morseList.put("k", "-.-");
            morseList.put("l", ".-..");
            morseList.put("m", "--");
            morseList.put("n", "-.");
            morseList.put("o", "---");
            morseList.put("p", ".--.");
            morseList.put("q", "--.-");
            morseList.put("r", ".-.");
            morseList.put("s", "...");
            morseList.put("t", "-");
            morseList.put("u", "..-");
            morseList.put("v", "...-");
            morseList.put("w", ".--");
            morseList.put("x", ".--");
            morseList.put("y", "-.--");
            morseList.put("z", "--..");


            for (int i = 0; i < textToMorse.length(); i++) {
//                System.out.print(textToMorse.substring(i,i+1) + "  ");

//                System.out.println(morseList.get(textToMorse.substring(i,i+1)) + "  ");
                message.append(morseList.get(textToMorse.substring(i, i + 1)));
                message.append("  ");
            }



        /*        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.-", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");*/

            return message;
        }
    }