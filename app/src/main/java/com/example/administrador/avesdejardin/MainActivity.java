package com.example.administrador.avesdejardin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rct;
    public TurismoAdapter adaptador;
    private RecyclerView.LayoutManager layoutManager;

    List Lugares = new ArrayList();

    public static Turismo lugares = new VectorSitios();
    /*public TurismoAdapter Ta;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rct = (RecyclerView) findViewById(R.id.rvTurismo);
        initializeData();

       // recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adaptador = new  TurismoAdapter(this, lugares);
        rct.setAdapter(adaptador);
        layoutManager = new LinearLayoutManager(this);
        rct.setLayoutManager(layoutManager);

        //adapter = new TurismoAdapter(Lugares);
        rct.setAdapter(adaptador);
       // RVTurismo =(RecyclerView) findViewById(R.id.rvTurismo);
        //RVTurismo.setLayoutManager(llm);
        //RVTurismo.setAdapter(Ta);*/

    }


    private void initializeData(){
        Lugares = new ArrayList<>();
        Lugares.add(new ListaLugares("La Argelia", "Restaurante,truchera y mas", R.drawable.restaurante));
        Lugares.add(new ListaLugares("Charcos el angel", "Aguas cristalinas", R.drawable.naturaleza));
        Lugares.add(new ListaLugares("Posada del Camino", "Comidas tipicas y alojamiento", R.drawable.hotel));
        Lugares.add(new ListaLugares("Cuevas del esplendor", "Aventuras y deportes extremos", R.drawable.deporte));
    }
}
