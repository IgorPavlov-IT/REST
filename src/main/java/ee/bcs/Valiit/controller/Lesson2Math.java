package ee.bcs.Valiit.controller;

import java.util.Scanner;


public class Lesson2Math {


    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Palun sisesta kaks numbrit: ");
        int num1 = scanner1.nextInt();
        int num2 = scanner1.nextInt();
        System.out.println("Sisestatud numbritest väikseim on: " + Math.min(num1 , num2));

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Palun üks number: ");
        int numAbsoluut = scanner2.nextInt();
        System.out.println("Sisestatud numbri absoluut väärtus on: " +  getAbsValue(numAbsoluut));

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Palun sisesta 3 numbrit: ");
        int n1 = scanner3.nextInt();
        int n2 = scanner3.nextInt();
        int n3 = scanner3.nextInt();
        System.out.println(min(n1,n2, n3));

    }

    public static int getMinValue(int a, int b) {              // TODO tagasta a ja b väikseim väärtus
        if (a > b) {
            return b;
        } else {
            return a;

        }

    }

    public static int getMaxValue(int a, int b) {              // TODO tagasta a ja b suurim väärtus

        if (a > b) {
            return a;
        } else {
            return b;
        }


    }

    public static int getAbsValue(int a) {                   // TODO tagasta a absoluut arv

        if (a > 0) {
            return a;
        } else {
            return -a;
        }

    }

    public static boolean isEven(int a) {                    // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        return a % 2 == 0;
    }

    public static int min(int a, int b, int c) {              // TODO tagasta a, b ja c väikseim väärtus
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }

    }

    public static int max3(int a, int b, int c) {              // TODO tagasta a, b ja c suurim väärtus
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }

    }

}
