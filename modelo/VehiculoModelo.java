package proyectoflotas.modelo;

// Clase básica para representar un vehículo
// Principio L: Si se crea una clase que herede de VehiculoModelo (por ejemplo, VehiculoMecanico),
// esa clase debe ser intercambiable donde se use VehiculoModelo sin afectar la funcionalidad.
//Privados para limitar el acceso dentro del proyecto por seguridad



public class VehiculoModelo {
    private String idVehiculo; 
    private String tipoVehiculo; 

    // Constructor para inicializar el objeto
    public VehiculoModelo(String idVehiculo, String tipoVehiculo) {
        this.idVehiculo = idVehiculo;
        this.tipoVehiculo = tipoVehiculo;
    }

    // Getters y setters (Permiten acceso controlado a las variables)
    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}
