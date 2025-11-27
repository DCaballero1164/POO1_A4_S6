package cl.salmontt.ui;

import cl.salmontt.data.GestorUnidades;
import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.PlantaProceso;
import cl.salmontt.model.UnidadOperativa;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Se llama al gestor de unidades
        GestorUnidades gestor = new GestorUnidades();

        //Se crea una lista que guarda las unidades a consultar
        List<UnidadOperativa> unidades = gestor.consultarUnidades();

        System.out.println("\n==== Todas las unidades ====");
        System.out.println("\nUnidades operativas:");
        unidades.forEach(u -> System.out.println(u.toString()));

        System.out.println("\n==== Unidades filtradas por clase ====");
        System.out.println("\nClase CentroCultivo:");
        //colleciones para imprimir los resultados con toString
        unidades.stream()
                .filter(u -> u.getClass().equals(CentroCultivo.class))
                .forEach(u -> System.out.println(u.toString()));

        System.out.println("\nClase PlantaProceso:");
        unidades.stream()
                .filter(u -> u.getClass().equals(PlantaProceso.class))
                .forEach(u -> System.out.println(u.toString()));
    }
}