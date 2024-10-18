import java.util.ArrayList;
import java.util.Scanner;
class Empleado {

    public String nombre;
    public int categoria;
    public double salario;

    public Empleado(String nombre, int categoria, double salario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public double getSalario() {
        return salario;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.println("Ingrese la cantidad de empleados:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            String nombre = scanner.next();

            System.out.println("Ingrese la categoría del empleado " + nombre + " (1, 2, 3 o 4):");
            int categoria = scanner.nextInt();

            System.out.println("Ingrese el salario básico del empleado " + nombre + ":");
            double salario = scanner.nextDouble();

            empleados.add(new Empleado(nombre, categoria, salario));
        }
        for (Empleado empleado : empleados) {
            double bonificacion =  0;
            double descuento = 0;

            switch (empleado.getCategoria()) {
                case 1:
                    bonificacion = 0.15;
                    descuento = 0.02;
                    break;
                case 2:
                    bonificacion = 0.10;
                    descuento = 0.015;
                    break;
                case 3:
                    bonificacion = 0.08;
                    descuento = 0.01;
                    break;
                case 4:
                    bonificacion = 0.05;
                    descuento = 0.005;
                    break;
                default:
                    System.out.println("Categoría no válida para el empleado " + empleado.getNombre());
                    continue;
            }
            double salarioActual = empleado.getSalario();
            double pagoTotal = salarioActual + (salarioActual * bonificacion) - (salarioActual * descuento);

            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Salario base: " + salarioActual);
            System.out.println("Bonificación: " + (bonificacion * 100) + "%");
            System.out.println("Descuento: " + (descuento * 100) +"%");
            System.out.println("Pago total: " + pagoTotal);
            System.out.println("--------------------------");
        }

        scanner.close();
    }
}
