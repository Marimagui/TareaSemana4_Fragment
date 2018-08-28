package code.maribelhll.tareasemana4_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import code.maribelhll.tareasemana4_fragment.adapter.MascotasAdaptador;
import code.maribelhll.tareasemana4_fragment.pojo.DatosMascotas;

public class MascotasLike extends AppCompatActivity {

    ArrayList<DatosMascotas> mascotas ;
    private RecyclerView listaMascotas;
    public MascotasAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_like);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.MiActionBar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        InicializarMascotas();
        InicializarAdaptador();

    }

    public void InicializarAdaptador (){
        adaptador = new MascotasAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void InicializarMascotas (){

        mascotas = new ArrayList<DatosMascotas>();
        mascotas.add(new DatosMascotas("Firulais", R.drawable.perro_1l, "4"));
        mascotas.add(new DatosMascotas("Bartolo", R.drawable.perro_2l, "0"));
        mascotas.add(new DatosMascotas("Oso", R.drawable.perro_3l,"8"));
        mascotas.add(new DatosMascotas("Chester", R.drawable.perro_4l, "5"));
        mascotas.add(new DatosMascotas("Cometa", R.drawable.perro_5l, "10"));
    }

}

