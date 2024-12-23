package vista;
import proyectoflotas.controlador.ConductorControlador;

// Clase para manejar la visualización de conductores
public class ConductorVista {

    // Método para mostrar información de un conductor
    public void mostrarConductor(ConductorModelo conductor) {
        if (conductor != null) {
            System.out.println("ID del Conductor: " + conductor.getIdConductor());
            System.out.println("Nombre del Conductor: " + conductor.getNombreConductor());
        } else {
            System.out.println("Conductor no encontrado.");
        }
    }

    // Método para mostrar un mensaje genérico
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}


