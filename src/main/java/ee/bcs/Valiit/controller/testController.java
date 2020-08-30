package ee.bcs.Valiit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    //---------------------------------------------------------------------------------------------------------------------------------------
    @GetMapping("/shownumber/{sum}")
    public static int shownumber(@PathVariable("sum") int m) {               // URL :     http://localhost:8080/shownumber/20
        return m;                                                            // Answer : 20
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
    @GetMapping("/fibonacci/{fibo}")                                         // URL :    http://localhost:8080/fibonacci/20
        // http://localhost:8080/fibonacci/10 või                            // Answer : 4181
        // http://localhost:8080/fibonacci/22

    public static int fibonacci(@PathVariable("fibo") int m) {
        return Lesson2.fibonacci(m);
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    @GetMapping("/fibonacciEven/{fiboEven}")  // NB! Case sensitive          // URL :    http://localhost:8080/fibonacciEven/10
                                                                             // Answer : 42
    public static int showFibonacciEven(@PathVariable("fiboEven") int m) {
        return Lesson3Hard.evenFiboSum(m);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
    @GetMapping(value = "/")           // this means root-folder             // URL : http://localhost:8080
    public String getHelloWorld() {                                          // Output: "Hello My world"
        return "Hello My World";
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
        // min of array @RequestParam
    @GetMapping("minof")                                                     // URL : http://localhost:8080/minof?array=5,4,3,2,10,6
    public static int minofall(@RequestParam("array") int[] x){              // Answer : 2
        return Lesson3.minOf(x);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
        // max of 3 values @RequestParam
    @GetMapping("maxof3")                                                    // URL : http://localhost:8080/maxof3?nr1=5&nr2=4&nr3=2
    public static int maxof3(@RequestParam("nr1") int x,                     // Answer : 5
                             @RequestParam("nr2") int y,
                             @RequestParam("nr3") int z){
        return Lesson2Math.max3(x,y,z);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
        // sum of full array @PathVariable
    @GetMapping("/sumOfArray/{sum}")                                         // URL : http://localhost:8080/sumOfArray/1,2,3,4,5
    public static int sumofall(@PathVariable("sum") int[] x){                // Answer : 15
        return Lesson3.sumOf(x);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
        // sum of full array @RequestParam
    @GetMapping("/sumofarray/")                                              // URL : http://localhost:8080/sumofarray?array=5,4,3,2,1
    public static int sumOfArray(@RequestParam("array") int[] x){            // Answer : 15
        return Lesson3.sumOf(x);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------

    @GetMapping("abs/{abs}")
    public static int showAbs(@PathVariable("abs") int m){                   // URL : http://localhost:8080/abs/-11
        return Lesson2Math.getAbsValue(m);                                   // Answer: 11
    }

    //---------------------------------------------------------------------------------------------------------------------------------------

    @GetMapping("isEven/{isEven}")    // NB! Case sensitive                  // URL : http://localhost:8080/isEven/82
    public static boolean isItEven(@PathVariable("isEven") int m){           // Output : true

        return Lesson1MathUtil.isEven(m);                                    // This is also in Lesson1MathUtil
    }                                                                        // As well as in Lesson2Math

    //---------------------------------------------------------------------------------------------------------------------------------------

    @GetMapping("isiteven")           // NB! Case sensitive                  // URL : http://localhost:8080/isiteven?isItEven=55
    public static boolean isItEven2(@RequestParam("isItEven") int m){        // Output : false
        return Lesson2Math.isEven(m);                                        // This is also in Lesson1MathUtil
    }                                                                        // As well as in Lesson2Math

    //---------------------------------------------------------------------------------------------------------------------------------------

    @GetMapping("even/{evenX}")                                              // URL : http://localhost:8080/even/82
    public static int showEven(@PathVariable("evenX") int m){                // Answer : 166
        return Lesson2.xOfEvenNumbers(m);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
        // mingi numbri numbriline pikkus vastavalt tingimustele.
    @GetMapping("jada/{jada 3n}")                                            // URL : http://localhost:8080/jada/8
    public static int showJada3n(@PathVariable("jada 3n") int m){            // Answer : 4
        return Lesson2.jadaPikkusArvutus(m);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
        // mingi numbri (massiivi) vahemiku pikim numbrijada.                // URL : http://localhost:8080/jadavahemik/900,1000
    @GetMapping("jadavahemik/{jada 3n2},{jada 3n1}")                         // Answer : 174
    public static int showJada3n2(@PathVariable("jada 3n2") int m, @PathVariable("jada 3n1") int n){
        return Lesson2.ex5PikimJada(m,n);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
        // Factiorial                                                        // URL : http://localhost:8080/factorial/10
    @GetMapping("factorial/{fact}")                                          // Answer : 3628800
    public static int factorial(@PathVariable("fact") int f){
        return Lesson3.factorial(f);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
    // Sort array by size
    @GetMapping("/sortarray/{arraysort}")                                    // URL : http://localhost:8080/sortarray/5,4,30,2,1,8,10
    public static int[] sortarray(@PathVariable("arraysort") int[] x){       // Output : [1,2,4,5,8,10,30]
        return Lesson3.sortBySize(x);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
        // Convert text to morse code.
    @GetMapping("toMorse/{morse}")                                           // URL: http://localhost:8080/toMorse/tallinn
    public static StringBuilder translateToMorse(@PathVariable("morse") String m){
        return Lesson3Hard.morseCode(m);                                     // Output : - .- .-.. .-.. .. -. -.
    }


    //---------------------------------------------------------------------------------------------------------------------------------------
    // Convert text to backwards text.
    @GetMapping("toBackwards/{back}")                                       // URL: http://localhost:8080/toMorse/tallinn
    public static StringBuilder convertBackwards(@PathVariable("back") String m){
        return Lesson3.reverseString2(m);                                   // Output : nnillat
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    // Check if number is a Prime number.
    @GetMapping("checkPrime/{prime}")                                       // URL: http://localhost:8080/checkPrime/23
    public static boolean isItPrime(@PathVariable("prime") int m){          // Answer : true
        return Lesson3.isPrime(m);
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    // korrutustabel vastavalt kasutaja sisendile.                           // URL : http://localhost:8080/multiply/3,3
    @GetMapping("multiply/{korrut1},{korrut2}")                              // Output : [[1,2,3],[2,4,6],[3,6,9]]
    public static int[][] multiply(@PathVariable("korrut1") int m, @PathVariable("korrut2") int n){
        return Lesson2.multiplication(m,n);
    }
    //



}




