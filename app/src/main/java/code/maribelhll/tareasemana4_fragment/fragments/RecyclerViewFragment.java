package code.maribelhll.tareasemana4_fragment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import code.maribelhll.tareasemana4_fragment.R;
import code.maribelhll.tareasemana4_fragment.adapter.MascotasAdaptador;
import code.maribelhll.tareasemana4_fragment.pojo.DatosMascotas;

public class RecyclerViewFragment extends Fragment {

    ArrayList<DatosMascotas> mascotas ;
    private RecyclerView listaMascotas;
    public MascotasAdaptador adaptador;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview, container,false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        InicializarMascotas();
        InicializarAdaptador();

        return v;
    }

    public void InicializarAdaptador (){
        adaptador = new MascotasAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void InicializarMascotas (){

        mascotas = new ArrayList<DatosMascotas>();
        mascotas.add(new DatosMascotas("Cometa", R.drawable.perro_5l, "2"));
        mascotas.add(new DatosMascotas("Bartolo", R.drawable.perro_2l, "6"));
        mascotas.add(new DatosMascotas("Oso", R.drawable.perro_3l,"1"));
        mascotas.add(new DatosMascotas("Firulais", R.drawable.perro_1l, "8"));
        mascotas.add(new DatosMascotas("Chester", R.drawable.perro_4l, "7"));
    }

}
