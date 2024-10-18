import java.util.Scanner;

class Estudiante {

    public String nombre;
    public String documento;
    public String telefono;

    public Estudiante(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Viaje {

    public int codigo;
    public String ciudad;
    public String fechaHora;

    public Viaje(int codigo, String ciudad, String fechaHora) {


        this.codigo = codigo;
        this.ciudad = ciudad;
        this.fechaHora = fechaHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        return "Ciudad: " + ciudad + ", Fecha y Hora: " + fechaHora;
    }
}

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el documento del estudiante:");
        String documento = scanner.nextLine();

        System.out.println("Ingrese el teléfono del estudiante:");
        String telefono = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, documento, telefono);

        Viaje[] viajes = new Viaje[4];
        viajes[0] = new Viaje(1, "Medellín","---- 6 de octubre ---– 8 am");
        viajes[1] = new Viaje(2, "Bogotá", "---- 10 de noviembre ---- 6 pm");
        viajes[2] = new Viaje(3, "Cartagena", "---- 5 de abril ---- 2 pm");
        viajes[3] = new Viaje(4, "Barranquilla", "----4 de mayo ---- 4 am");

        System.out.println("\nCiudades disponibles para viajar:");
        for (Viaje viaje : viajes) {
            System.out.println(viaje.getCodigo() + ". " + viaje.getCiudad() + " - " + viaje.getFechaHora());
        }

        System.out.println("\nSeleccione la ciudad ingresando el código correspondiente:");
        int codigoSeleccionado = scanner.nextInt();

        Viaje viajeSeleccionado = null;
        for (Viaje viaje : viajes) {
            if (viaje.getCodigo() == codigoSeleccionado) {
                viajeSeleccionado = viaje;
                break;
            }
        }


        if (viajeSeleccionado != null) {
            System.out.println("\n-----------Comprobante de viaje-----------:");
            System.out.println("--- Esastudiante: " + estudiante.getNombre());
            System.out.println("--- Documento: " + estudiante.getDocumento());
            System.out.println("--- Teléfono: " + estudiante.getTelefono());
            System.out.println("--- Destino: " + viajeSeleccionado.getCiudad());
            System.out.println("--- Fecha y Hora: " + viajeSeleccionado.getFechaHora());
        } else {
            System.out.println("Código de ciudad no válido.");
        }


        scanner.close();
    }
}
