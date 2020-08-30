package ee.bcs.Valiit.controller;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
//        System.out.println(sumCalc(5, 41));
//        {int[] x = {5,6,4,5,10};
//        System.out.println(sumOf(x));}
//        System.out.println(factorial(6));
//        System.out.println(isPrime(97));
//        int [] y = {2,6,4,1,5,3};
//        System.out.print(Arrays.toString(sortBySize(y)));
//          reverseString("TESTID");
    }

    public static int sumCalc(int x, int y) {               // TODO liida kokku ja tagasta x ja y väärtus
        int sum = x + y;
        return sum;
    }

    public static int sumOf(int[] x) {                     // Todo liida kokku kõik numbrid massivis x
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }

        return sum;
    }

    public static int minOf(int[] x) {                     // Todo leida massivis x väikseim väärtus
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }

        }


        return min;
    }


    public static int factorial(int x) {                  // TODO tagasta x faktoriaal.
        int fac = 1;
        if (x <= 12 && x > 0) {                                // Näiteks
            for (int i = 2; i <= x; i++) {                    // x = 5
                fac = fac * i;                                // return 5*4*3*2*1 = 120

            }
            return fac;

        }
        return 0;
    }

    public static int[] sortBySize(int[] y) {                       // TODO sorteeri massiiv suuruse järgi
        Arrays.sort(y);                                             // Näiteks {2, 6, 8, 1}
        return y;                                                   // Väljund {1, 2, 6, 8}
    }

    public static void reverseString(String a) {                 // TODO tagasta string tagurpidi

        System.out.println(a);                                   // Näiteks:
        for (int i = a.length(); i > 0; i--) {                       // a = "Test";
            System.out.print(a.charAt(i - 1));                  // return tseT";
        }
    }
    public static StringBuilder  reverseString2(String b)  {
            StringBuilder messageBackwards = new StringBuilder();

            for (int i = b.length(); i>0; i--) {
                messageBackwards.append(b.charAt(i-1));
            }
            return messageBackwards;
        }




    public static boolean isPrime(int x) {             // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        boolean isPrime = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                isPrime = false;
            }

        }
        return isPrime;
    }

}