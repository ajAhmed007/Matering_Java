package control_flow;
    /**
     * Here are five problems that involve control flow in Java. These
     * problems will help you practice conditional statements, loops, and other
     * control flow constructs.
     * 
     * 1. FizzBuzz
     * Write a program that prints the numbers from 1 to 100. But for multiples of
     * 3, print "Fizz" instead of the number, and for the multiples of 5, print
     * "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".
     * 
     * 2. Leap Year
     * Create a program that checks if a given year is a leap year. A leap year is
     * divisible by 4, but not divisible by 100, unless it is also divisible by 400.
     * The program should print "Leap year" if the year is a leap year and "Not a
     * leap year" otherwise.
     * 
     * 3. Fibonacci Series
     * Write a program that generates the first n numbers of the Fibonacci series,
     * where n is a user-provided integer. The Fibonacci series is a sequence of
     * numbers in which each number is the sum of the two preceding ones, starting
     * from 0 and 1.
     * 
     * 4. Palindrome
     * Create a program that checks if a given string is a palindrome. A palindrome
     * is a word, phrase, number, or other sequences of characters that reads the
     * same forward and backward (ignoring spaces, punctuation, and capitalization).
     * 
     * 5. Grade Calculator
     * Write a program that calculates the final letter grade of a student based on
     * their numeric score. The program should use the following grading scale:
     * - A: 90-100
     * - B: 80-89
     * - C: 70-79
     * - D: 60-69
     * - F: 0-59
     * 
     * As you work on these problems, make sure to use appropriate control flow
     * constructs such as `if`, `else`, `for`, and `while` loops. Additionally, try
     * to break down each problem into smaller tasks and use helper methods when
     * necessary. This will help improve the readability and organization of your
     * code. Good luck!
     */

public class ControlFlow {
    public static void main(String[] args) {
        fizzBuzz();
        
    }

    /**
     * 1. FizzBuzz
     * Write a program that prints the numbers from 1 to 100. But for multiples of
     * 3, print "Fizz" instead of the number, and for the multiples of 5, print
     * "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".
     */
    public static void fizzBuzz() {

        //step1: loop from 1 to 100
        for(int i = 1; i <= 100; i ++){
            //for multiples of 3
            if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }

    }


}
