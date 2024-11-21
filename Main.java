public class Main {
    public static void main(String[] args) {
        double e = 1.0;
        double term;
        double n = 1.0;

        // Loop para calcular o limite tendendo a 0
        do {
            term = 1.0 / factorial(n);
            e += term;
            n++;
        } while (term > 1e-10); 

        System.out.printf("Constante de Euler: %.10f\n", e);
    }

    // Função para calcular o fatorial
    private static double factorial(double num) {
        if (num == 0 || num == 1) {
            return 1.0;
        }
        double result = 1.0;
        for (double i = 2.0; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
