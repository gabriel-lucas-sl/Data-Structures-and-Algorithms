package recursion;

class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int result = f.fibonacci(-5);
        System.out.println(result);
    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
