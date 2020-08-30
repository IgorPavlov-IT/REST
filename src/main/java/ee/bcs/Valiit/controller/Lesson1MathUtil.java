package ee.bcs.Valiit.controller;

public class Lesson1MathUtil {

    public static void main(String[] args) {

//        System.out.println(getMinValue(5, 8));
//        System.out.println(getMaxValue(3, 7));
//        System.out.println(getAbsValue(-54));
//        System.out.println(isEven(95865));
//        System.out.println("Väikseim arv on = " + min(5, 8, 154));
//        System.out.println("Suurim arv on = "   + max(547, 5854, 251));

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

    public static int max(int a, int b, int c) {              // TODO tagasta a, b ja c suurim väärtus
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }

    }
}