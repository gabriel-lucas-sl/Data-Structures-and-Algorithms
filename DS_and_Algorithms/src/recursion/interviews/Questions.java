package recursion.interviews;

class Questions {
    public static void main(String[] args) {
        Questions questions = new Questions();
        int result = questions.sumOfDigits(182);
        System.out.println(result);
    }

    // Question 1
    public int sumOfDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
