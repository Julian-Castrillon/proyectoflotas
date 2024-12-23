package proyectoflotas.controlador;

import proyectoflotas.modelo.ConductorModelo;
import proyectoflotas.vista.ConductorVista;;

// Clase para manejar la lógica de control relacionada con conductores
public class ConductorControl {

    private ConductorModelo conductorModelo; // Modelo del conductor
    private ConductorVista conductorVista; // Vista del conductor

    // Constructor quem relaciona modelo y vista
    public ConductorControl(ConductorModelo conductorModelo, ConductorVista conductorVista) {
        this.conductorModelo = conductorModelo;
        this.conductorVista = conductorVista;
    }

    /*Método para mostrar la información de un conductor
    en este metodo metodo me sale un error y no logro encontrar la solucion.
    public void mostrarConductor() {
        conductorVista.mostrarConductor(conductorModelo);
    }
    */

    // Método para actualizar el nombre del conductor
    public void actualizarNombre(String nuevoNombre) {
        conductorModelo.setNombreConductor(nuevoNombre);
        conductorVista.mostrarMensaje("Nombre del conductor actualizado a: " + nuevoNombre);
    }
}
