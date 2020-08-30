package ee.bcs.Valiit.controller;

public class Lesson1 {

    public static void main(String[] args) {
        excersie1();
        excersie2();
        excersie3();
        excersie4();
    }

    public static void excersie1(){
        int a = 1;
        int b = 1;
        int c = 3;

        System.out.println("a==b " + "ja " + "a==c");

        {
            a = c;
            System.out.println("a==b " + "ja " + "a==c");
        }
        // Variant #2

        System.out.println(a==b);
        System.out.println(a==c);

        a=c;

        System.out.println(a==b);
        System.out.println(a==c);


        // TODO
        // defineeri 3 muutujat a = 1, b = 1, c = 3
        // Prindi välja a==b ja a==c
        // Lisa rida a = c
        // Prindi välja a==b ja a==c, mis muutus???  - Midagi?
    }

    public static void excersie2(){

        byte x1 = 10;
        byte x2 = 20;
        byte y1 = ++x1;
        System.out.println(x1 + ", " + y1);
        byte y2 = x2++;
        System.out.println(x2 + ", " + y2);


        // TODO
        // Loo muutujad x1 = 10 ja x2 = 20, vali sobiv andmetüüp
        // Tekita muutuja y1 = ++x1, trüki välja nii x1 kui y1
        // Tekita muutuja y2 = x2++, trüki välja nii x2 ja y2
        // Analüüsi tulemusi
    }

    public static void excersie3(){
        byte a = 18 % 3;
        byte b = 19 % 3;
        byte c = 20 % 3;
        byte d = 21 % 3;

        System.out.println("a= " + a + "  b= " + b + "  c= " + c + "  d= " + d);


        // TODO
        // Loo arvulised muutujad  [need on jäägi arvutus]
        // a = 18 % 3
        // b = 19 % 3
        // c = 20 % 3
        // d = 21 % 3
        // Prindi välja kõigi muutujate väärtused
    }

    public static void excersie4(){

        String text1 = " \\\"\\\\\"";
        System.out.println(text1);

        // TODO
        // Defineeri String tüüpi muutuja mille sisu oleks „\“\\““
        // Trüki muutuja sisu välja
    }

}
