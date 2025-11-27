package cl.salmontt.model;

public class PlantaProceso extends UnidadOperativa{

    //Se definen los atributos de la subclase
    private double capacidadProceso;

    //Constructor de la subclase
    public PlantaProceso(String nombre, String comuna, double capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    //Getter
    public double getCapacidadProceso() {
        return capacidadProceso;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "PlantaProceso{" +
                "nombre='" + getNombre() + '\'' +
                ", comuna='" + getComuna() + '\'' +
                ", capacidadProceso=" + getCapacidadProceso() +
                '}';
    }
}
