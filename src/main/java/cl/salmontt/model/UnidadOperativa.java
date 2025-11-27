package cl.salmontt.model;

public class UnidadOperativa {

    //Se definen los atributos de la superclase
    private String nombre;
    private String comuna;

    //Valores iniciales de los atributos
    public UnidadOperativa() {
        this.nombre = "Desconocido";
        this.comuna = "Desconocido";
    }

    //Costructor de la superclase UnidadOperativa
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    //Metodo toString
    public String toString() {
        return "UnidadOperativa{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
