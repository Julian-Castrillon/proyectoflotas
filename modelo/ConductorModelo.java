package proyectoflotas.modelo;

// Clase básica para representar un conductor
// Principio L: Si se extiende esta clase (por ejemplo, ConductorNovato),
// las nuevas clases deben ser intercambiables donde se utilice ConductorModelo sin afectar la clase padre.

public class ConductorModelo {
    private String idConductor; 
    private String NombreConductor; 

    // Constructor para inicializar el objeto
    public ConductorModelo(String idConductor, String NombreConductor) {
        this.idConductor = idConductor;
        this.NombreConductor = NombreConductor;
    }

    // Getters y setters (Permiten acceso controlado a las variables)
    public String getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(String idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombreConductor() {
        return NombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.NombreConductor = nombreConductor;
    }
}

