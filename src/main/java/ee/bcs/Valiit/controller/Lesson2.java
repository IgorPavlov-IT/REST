package ee.bcs.Valiit.controller;

import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        //exercise1();
        //exercise2(4);
        //exercise3(5,5);
//        System.out.println(fibonacci(5));              // Sisuliselt on see exercise 4.
        // exercise5(581)                                // See on Jada 1/3 ülesanne, kus leiame jada pikkuse numbrile.
//        System.out.println(ex5PikimJada(900, 1000));
        //exercise7();
        //exercise8();
    }


//        // TODO loo 10 elemendile täisarvude massiv
//        // TODO loe sisse konsoolist 10 täisarvu
//        // TODO trüki arvud välja vastupidises järiekorras
//        // exercise 1 lahendab selle ülesande.

//    public static void exercise1() {
//        Scanner scan1 = new Scanner(System.in);                     // Loome Scan1 "objekti"
//        System.out.println("Palun sisestage 10 numbrit: ");
//        int[] m = new int[10];                                      // See osa määrab massiivi m, mis koosneb 10st väärtusest. (3)
//        for (int i = 0; i < 10; i++) {                              // See osa tagab selle, et sisendeid küsitakse 10 tk. (3)
//            m[i] = scan1.nextInt();                                 // See funktsioon küsib kasutajalt sisendit ning määrab massiivile.
//
//        }
//        for (int h = 9; h >= 0; h--) {                              // Siin meie teeme 10 korda loop'is mingi funktsiooni:
//
//            System.out.println(m[h]);                               // Iga loop kohta prindime välja masiivi väärtuse//
//                                                                    // kahanevas järjekorras.
//
//        }
//    }

    // TODO prindi välja x esimest paaris arvu
    // exercise 2 (2 varianti) + 1 for REST (@PathVariable/@RequestParam)

//    public static void exercise2(int x) {
//          Scanner scan2 = new Scanner(System.in);
//          System.out.println("Sisestage mitu paaris arvu soovite");
//          int n = scan2.nextInt();
//
//          for (int i = 0; i < n; i++) {
//            System.out.println(i * 2 + 2);
//          }
//        }


//    public static void exercise2(int x) {
//        Scanner scan3 = new Scanner(System.in);
//        System.out.println("Sisestage mitu paaris arvu soovite");
//        int n = scan3.nextInt();
//
//        for (int i = 0; i / 2 < n; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + 2);
//            }
//        }
//    }

        public static int xOfEvenNumbers(int x) {
            return x * 2 + 2;
          }





    // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
    // TODO näiteks x = 3 y = 3
    // TODO väljund

//    public static void exercise3(int x, int y) {
//
//    Scanner scan4 = new Scanner(System.in);
//        System.out.println("Mitu tulpa korrutustabelis? : ");
//        x = scan4.nextInt();
//        System.out.println("Mitu rida korrutustabelis? : ");
//        y = scan4.nextInt();
//      //        int kordaja = 1;
//        for (int i = 1 ; i<=y ; i++) {
//
//            for (int j = 1 ; j<=x ; j++) {
//
//                System.out.print(i*j + "  ");             // i asemel oli enne "kordaja".
//
//            }
//      //            kordaja++;
//            System.out.println("");
//        }
//    }


    public static int[][] multiplication(int z, int w) {
        int [][] mult = new int[w][z];
        mult[0][0] = 0;
        for (int i = 1 ; i<=z ; i++) {

            for (int j = 1 ; j<=w ; j++) {
                mult[i-1][j-1] = (i) * (j);

            }

        }
        return mult;
    }



    //     TODO
    //     Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
    //     0, 1, 1, 2, 3, 5, 8, 13, 21
    //     Tagasta fibonacci jada n element

    public static int fibonacci(int n) {
//        Scanner scan5 = new Scanner(System.in);
//        System.out.println("Milline Fibonacci number kuvada? : ");
//        n = scan5.nextInt();
        final int fibo1 = 0;
        final int fibo2 = 1;
        int fiboyleelmine = fibo1;
        int fiboeelmine = fibo2;
        int fibo = 0;
        if (n == 1) {
            return fibo1;
        } else if (n == 2) {
            return fibo2;
        } else if (n > 2) {

            for (int i = 2; i < n; i++) {
                fibo = fiboeelmine + fiboyleelmine;
                fiboyleelmine = fiboeelmine;
                fiboeelmine = fibo;

                // See segment on vaheldava kasutamisega katse, aga see ei toiminud.
                //                if (i % 2 == 0) {
                //                    fibo = fibo + fiboy;
                //                    fibox = fiboy;
                //                } else {
                //                    fibo = fibo + fibox;
                //                    fiboy = fibox;
                //                }

            }
            return fibo;
        } else {
            return 0;

        }
    }

    // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
    // See lahendatud ülesandes 5.

//    public static void exercise5(int n) {
//        int nAlg = n;
//        int counter = 1;
//        if (n <= 0) {
//            System.out.println(nAlg + " ei ole sobiv number");
//        } else if (n == 1) {
//            System.out.print(nAlg);
//        } else {
//            do {
//                System.out.print(n + " ");
//                counter++;
//
//                if (n > 1 && n % 2 == 1) {
//                    n = 3 * n + 1;
//
//                } else if (n > 1 && n % 2 == 0) {
//                    n = n / 2;
//                }
//            } while (n > 1);
//            System.out.print(n);
//            System.out.println();
//            System.out.println(nAlg + " numbri jada on lõpetatud.");
//            System.out.println("Jada pikkus on " + counter);
//        }
//    }

    public static int ex5PikimJada(int a, int b) {
        int a1 = Math.min(a, b);                                        // Võib kasutada massiive; võib kasutada "ühte" muutujat
        int b1 = Math.max(a, b);                                        // ning iga uue väärtuse puhul võrrelda, kas saadud tulemus
        int maxLength = 1;                                              // tuli suurem, kui olemasolev muutuja.
        int calcLength = 0;
        for (int i = a1; i <= b1; i++) {
            calcLength = jadaPikkusArvutus(i);
//            System.out.println(calcLength);
            if (maxLength < calcLength) {
                maxLength = calcLength;
            }


        }
        return maxLength;
    }

    public static int jadaPikkusArvutus(int m) {                            // siin peab olema loop.
        int counter = 1;
        if (m == 1) {
            return counter;
        } else {
            do {
                if (m % 2 == 1) {
                    m = n3multiply(m);                                      // võib kasutada meetodit, kui meie seda
//                    m = 3 * m +1;                                         // veel kuskil kasutame, või kasutada valemit.
                    counter++;
                } else {
                    m = n2divide(m);                                       // võib kasutada meetodit, kui meie seda
//                    m = m / 2;                                           // veel kuskil kasutame, või kasutada valemit.
                    counter++;
                }


            } while (m > 1);
            return counter;
        }

    }
            public static int n3multiply(int m){
                m = (3 * m) + 1;
                return m;
            }

            public static int n2divide(int m){
                m = m / 2;
                return m;
            }



        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */



            //public static void exercise6() throws Exception{      // Mis asi on throw Exception?

            //}

            public static void exercise7 () {
                // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
                // Kõigepealt teeme jagamise (sulgudes), seejärel lahutamise ning seejärel korrutamise.
                BigDecimal a = new BigDecimal("1.89");
                BigDecimal b = new BigDecimal("394486820340");
                BigDecimal c = new BigDecimal("15");
                BigDecimal d = new BigDecimal("4");
                BigDecimal subtotalA = b.divide(c);
                BigDecimal subtotalB = subtotalA.subtract(d);
                BigDecimal subtotalC = a.multiply(subtotalB);

                System.out.println(subtotalC.toString());
            }

//            public static void exercise8(String[] args) {
//                File myObject = new File("nums.txt");
//                Path filePath = new Paths.get("nums.txt");
//
//                Long summ = new Long();
//
//                Scanner fileReader = new Scanner(myObject);
//                Scanner fileScanner2 = new Scanner(filePath);
//
//                    while (fileReader.hasNextLong()) {
//                        summ.
//                    }
//            }

        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina. Commandline method

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */


            //public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
        */

        }
