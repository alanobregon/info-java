package Propuestos.Functions;

public class App {
    public static void main(String[] args) {
        System.out.println("Función suma: " + suma(4, 4));
        System.out.println("Función factorial: " + factorial(5));
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return (n * factorial(n - 1));
    }
}