/*
Assignment: 1
Name: Kenji Nakanishi 
Professor: Ian O'Toole
Course: Software Integration, Configuration, and Testing
Date: 1/18/2026
*/

// The Fibonacci Sequence is defined by its recurrence relation; 
// F(0) = 0, F(1) = 1  -> first two values 
// and when F(n); n > 1 the,
// F(n) = F(n - 1) + F( n - 2)
// https://en.wikipedia.org/wiki/Fibonacci_sequence

public class FibonacciSequence {

    public static int fibonacci(int n) {

        // Examplification:
        // Fibonacci(0) = 0
        // F(1) = 1
        // *** F(n) = F(n - 1) + F( n - 2) ***
        // F(2) = F(1) + F(0) = 1 + 0 = 1
        // F(3) = F(2) + F(1) = 1 + 1 = 2
        // F(4) = F(3) + F(2) = 2 + 1 = 3
        // F(5) = F(4) + F(3) = 3 + 2 = 5

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // when it comes to the F(n) the method will start performing calculation with:
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    // Main method
    public static void main(String[] args) {
        // accept n as parameter and pass 10 as an argument:
        int n = 10;

        System.out.println("Performing calculations for Fobinacci " + n + " th term...");

        // Loading animation using Thread.sleep:
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("\n something happened... ; check please" + e.getMessage());
            }
            System.out.print(".");
        }

        System.out.println();

        // Print result in the indicated format:
        int y = fibonacci(n);
        System.out.println("The " + n + " th term of the Fibonacci sequence is " + y);
    }
}