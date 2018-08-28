package code.maribelhll.tareasemana4_fragment.pojo;

public class DatosMascotas {

    private String nombre;
    private int foto;
    private String likes;

    public DatosMascotas(String nombre, int foto, String likes) {
        this.nombre = nombre;
        this.foto = foto;
        this.likes = likes;
    }

    public DatosMascotas (int foto, String likes){
        this.foto = foto;
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
