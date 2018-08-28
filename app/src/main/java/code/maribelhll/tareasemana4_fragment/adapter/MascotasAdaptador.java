package code.maribelhll.tareasemana4_fragment.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import code.maribelhll.tareasemana4_fragment.pojo.DatosMascotas;
import code.maribelhll.tareasemana4_fragment.R;

public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotasViewHolder> {

    ArrayList<DatosMascotas> mascotas;
    Activity activity;

    public MascotasAdaptador(ArrayList<DatosMascotas> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotasViewHolder mascotasViewHolder, final int position) {

        final DatosMascotas mascota = mascotas.get(position);
        mascotasViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotasViewHolder.nombreCV.setText(mascota.getNombre());
        mascotasViewHolder.likesCV.setText(mascota.getLikes());

        mascotasViewHolder.btnlikesCV.setOnClickListener(new View.OnClickListener() {
            int cuenta =1;
            String valor;
            @Override
            public void onClick(View v) {
                //Toast.makeText(activity, "Like a "+mascota.getNombre()+mascota.getLikes(),Toast.LENGTH_SHORT).show();
                cuenta = cuenta+1;
                valor=String.valueOf(cuenta);
                mascota.setLikes(valor);
                mascotasViewHolder.likesCV.setText(mascota.getLikes());
            }
        });
    }


    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView nombreCV;
        private TextView likesCV;
        private ImageButton btnlikesCV;

        public MascotasViewHolder(View itemView) {
            super(itemView);
            imgFoto     = (ImageView) itemView.findViewById(R.id.imgFotoCV);
            nombreCV    = (TextView) itemView.findViewById(R.id.txtNombre_mascotaCV);
            likesCV     = (TextView) itemView.findViewById(R.id.txtNumLikesCV);
            btnlikesCV   = (ImageButton)itemView.findViewById(R.id.btnLikeCV);

        }
    }

}
