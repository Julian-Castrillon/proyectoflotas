package proyectoflotas.controlador;

import proyectoflotas.modelo.VehiculoModelo;
import proyectoflotas.vista.VehiculoVista;
import java.util.ArrayList;
import java.util.List;

// Controlador para manejar la lógica de vehículos
// Principio D: El controlador depende de las abstracciones VehiculoModelo y VehiculoVista, no de sus implementaciones concretas.
// Principio L: Si se reemplaza VehiculoModelo con una subclase, este controlador debe seguir funcionando sin problemas.
public class VehiculoControlador {
    private List<VehiculoModelo> vehiculos = new ArrayList<>(); // Lista de vehículos
    private VehiculoVista vista;

    // Constructor
    public VehiculoControlador(VehiculoVista vista) {
        this.vista = vista;
    }

    // Agrega un vehículo
    public void agregarVehiculo(String idVehiculo, String tipoVehiculo) {
        VehiculoModelo vehiculo = new VehiculoModelo(idVehiculo, tipoVehiculo);
        vehiculos.add(vehiculo);
        vista.mostrarMensaje("Vehículo agregado: " + idVehiculo);
    }

    
}
