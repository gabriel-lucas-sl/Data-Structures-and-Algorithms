package recursion;

class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int result = f.factorial(-3);
        System.out.println(result);
    }

    public int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
