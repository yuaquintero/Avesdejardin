package com.example.administrador.avesdejardin;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Proyectos on 23/02/2017.
 */

public class TurismoAdapter extends RecyclerView.Adapter<TurismoAdapter.LugarViewHolder> {

    protected Turismo LugarTur;           //Lugares a mostrar
    protected LayoutInflater inflador;   //Crea Layouts a partir del XML
    protected Context contexto;          //Lo necesitamos para el inflador
    List <ListaLugares> lugares;


    /*public TurismoAdapter (List<ListaLugares> Lugares) {
        this.lugares=Lugares;
    }
*/
    public TurismoAdapter (Context contexto, Turismo  tur) {

        this.contexto=contexto;
        this.LugarTur=tur;
        inflador = (LayoutInflater) contexto
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public static class LugarViewHolder extends RecyclerView.ViewHolder {
        //CardView cv;
        TextView NombreLugar;
        TextView DescripcionLugar;
        ImageView FotoLugar;


        LugarViewHolder(View itemView) {
            super(itemView);
            //cv = (CardView)itemView.findViewById(R.id.cv);
            NombreLugar = (TextView)itemView.findViewById(R.id.tVsitio);
            DescripcionLugar = (TextView)itemView.findViewById(R.id.tVtextositio);
            FotoLugar = (ImageView)itemView.findViewById(R.id.iv_tur);
        }
    }

    @Override
    public LugarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View v = inflador.inflate(R.layout.vista_lugares_turismo, parent, false);

        //View v = LayoutInflater.from(viewGroup.getContext())
               // .inflate(R.layout.vista_lugares_turismo, viewGroup, false);

        return new LugarViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LugarViewHolder holder, int position) {

        LugarTuristico lugar= LugarTur.elemento(position);
        personalizaVista(holder,lugar);



    }

    @Override
    public int getItemCount() {
        return lugares.size();
    }

    public void personalizaVista(LugarViewHolder holder, LugarTuristico lugar)

    {
        holder.NombreLugar.setText(lugar.getNombre());
        holder.DescripcionLugar.setText(lugar.getComentario());
        holder.FotoLugar.setImageResource(R.drawable.naturaleza);

    }

}
