package com.example.administrador.avesdejardin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Proyectos on 21/02/2017.
 */

public class VectorSitios implements  Turismo {

    protected List<LugarTuristico> VectorSitios= ListaLugares();
    public VectorSitios(){

        VectorSitios=ListaLugares();
    }
    public LugarTuristico elemento(int id) {
        return VectorSitios.get(id);
    }

    public int Tamanio() {
        return VectorSitios.size();
    }

    public static ArrayList<LugarTuristico> ListaLugares()
    {
      ArrayList<LugarTuristico> lista= new ArrayList<LugarTuristico>();
        lista.add(new LugarTuristico("La Argelia","cra45 #478",5532222,"y@gmail.com",5.20,"ruta2",5.59890,-75.2897,"fotoArg",2.5,"Restaurante,truchera y mas"));
        lista.add(new LugarTuristico("Charcos el angel","cra5 #778",5542222,"x@gmail.com",3.20,"ruta2",5.59890,-75.2797,"fotoAngel",2.5,"Aguas cristalinas"));
        lista.add(new LugarTuristico("Posada del Camino","cra5 #578",5532222,"v@gmail.com",6.20,"ruta2",5.58978,-75.289497,"fotoPos",2.5,"Comidas tipicas y alojamiento"));
        lista.add(new LugarTuristico("Cuevas del esplendor","calle80 #678",5532222,"z@gmail.com",20.00,"ruta2",5.589150,-75.279897,"fotoArg",2.5,"Aventuras y deportes extremos"));

        return lista;

    }

}
