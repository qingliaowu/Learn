package javabasics;

// Java program for the above approach

class GFG {

    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 4;

        // Function Call
        Fibonacci(N);
    }
}
