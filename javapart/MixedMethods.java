package javapart;
public class MixedMethods {

    // 11th
    // Method with a for loop - printing numbers from 1 to 5
    public static void printNumbersFor() { 
    }

    // Method with a for loop - printing even numbers from 2 to 10
    public static void printEvenNumbersFor() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even (for): " + i);
        }
    }

    // 9th
    // Method with an if statement - check if a number is positive
    public static void checkPositive(int num) {
    }

    // Method with an if statement - check if a number is even
    public static void checkEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    // 10th
    // Method with a while loop - count down from 5
    public static void countdownWhile() {
        int i = 5;
    }

    // Method with a while loop - print numbers up to 5
    public static void countUpWhile() {
        int i = 1;
        while (i <= 5) {
            System.out.println("Count up (while): " + i);
            i++;
        }
    }

    // Method with input parameters - greeting message, adding two integers, decreasing a value by one
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
    // 5th

    public static void main(String[] args) {
        printNumbersFor();
        printEvenNumbersFor();
        checkPositive(10);
        checkEven(7);
        countdownWhile();
        countUpWhile();
        greet("Alice");
        System.out.println("Sum: " + addNumbers(3, 5));
    }
}
