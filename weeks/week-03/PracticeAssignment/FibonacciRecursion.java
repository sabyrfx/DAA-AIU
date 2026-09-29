public class FibonacciRecursion {

     public static void main(String[] args) {
        int count = 10; // Number of elements to print
        
        System.out.println("Fibonacci Series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base case: returns n if n is 0 or 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: sum of the two previous numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

   
}