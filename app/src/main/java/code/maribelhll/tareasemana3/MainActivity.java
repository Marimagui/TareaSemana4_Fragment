package code.maribelhll.tareasemana3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DatosMascotas> mascotas ;
    private RecyclerView listaMascotas;
    public MascotasAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.MiActionBar);
        setSupportActionBar(miActionBar);

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
        mascotas.add(new DatosMascotas("Cometa", R.drawable.perro_5l, 0));
        mascotas.add(new DatosMascotas("Bartolo", R.drawable.perro_2l, 0));
        mascotas.add(new DatosMascotas("Oso", R.drawable.perro_3l,0));
        mascotas.add(new DatosMascotas("Firulais", R.drawable.perro_1l, 0));
        mascotas.add(new DatosMascotas("Chester", R.drawable.perro_4l, 0));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mascotas_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mEstrella:
                Intent intent = new Intent(this, MascotasLike.class);
                startActivity(intent);
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }
}
