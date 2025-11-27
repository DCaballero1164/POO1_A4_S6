package cl.salmontt.data;

import cl.salmontt.model.UnidadOperativa;
import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.PlantaProceso;

import java.util.ArrayList;
import java.util.List;


public class GestorUnidades {

    public List<UnidadOperativa> consultarUnidades(){
        List<UnidadOperativa> unidades = new ArrayList<>();

        unidades.add(new CentroCultivo("Centro-Tenglo","Puerto Montt",1800));
        unidades.add(new CentroCultivo("Centro-Pargua","Calbuco",1100));
        unidades.add(new PlantaProceso("Planta-Quellon","Quellon",100));
        unidades.add(new PlantaProceso("Planta-Dalcahue","Dalcahue",200));

        return unidades; //retorna la lista de unidades
    }


}
