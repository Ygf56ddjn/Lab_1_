class Main{
    public static double sinc(double x, int terms) {
        if (x == 0) return 1; // sinc(0) = 1
        double sum = 0.0;
        for (int n = 0; n < terms; n++) {
            int factorial = factorial(2 * n + 1);
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial;
            sum += term;
        }
        return sum;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 1.0; // Значение x
        int terms = 10; // Количество членов ряда
        System.out.println("sinc(" + x + ") ≈ " + sinc(x, terms));
    }
}