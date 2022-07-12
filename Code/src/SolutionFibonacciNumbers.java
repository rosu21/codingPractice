public class SolutionFibonacciNumbers {

    public int fib(int n) {
        int[] fibMemory = new int[n+1];

        if (n == 0 || n == 1){
            fibMemory[n] = n;
            return fibMemory[n];
        }


        if (fibMemory[n] != 0) {
            return fibMemory[n];
        } else {
            fibMemory[n] = fib(n-1) + fib(n-2);
            return fibMemory[n];
        }
    }
}
