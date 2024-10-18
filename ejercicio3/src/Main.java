import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Ingrese el valor de 'a':");
            double a = scanner.nextDouble();

            System.out.println("Ingrese el valor de 'b':");
            double b = scanner.nextDouble();

            double x = a + (b * 2 * a);

            System.out.println("El valor de x es: " + x);

            System.out.println("¿Desea realizar otro cálculo? (s/n):");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("-----Programa finalizado-----");
        scanner.close();
    }
}
