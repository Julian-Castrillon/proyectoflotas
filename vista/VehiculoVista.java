package proyectoflotas.vista;
import proyectoflotas.modelo.VehiculoModelo;
import java.util.Scanner;

// Clase para mostrar datos de vehículos al usuario
// Principio D (SOLID): Esta clase depende de abstracciones, ya que funciona sin tener en cuenta como funciona internamente VehiculoModelo.

public class VehiculoVista {
    private Scanner scanner = new Scanner(System.in); 

    // Muestra un mensaje al usuario
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Solicita un dato al usuario
    public String solicitarDato(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    // Muestra los detalles de un vehículo
    public void mostrarVehiculo(VehiculoModelo vehiculo) {
        if (vehiculo != null) {
            System.out.println("ID Vehículo: " + vehiculo.getIdVehiculo() + ", Tipo: " + vehiculo.getTipoVehiculo());
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }
}
