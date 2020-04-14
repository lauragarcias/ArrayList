package poo2;
public class Pelicula 
{
  private String nombre,director,reseña;
  private int año;

    public Pelicula(String nom,String dir,String res,int anio) {
        nombre = nom;
        director=dir;
        reseña=res;
        año=anio;
    }
  @Override
    public String toString() {
        return ("Nombre: " + nombre + "\nDirector: "+director+ "\nAño: "+año+ "\nReseña:" + reseña);
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDirector() {
        return this.director;
    }
    public String getReseña() {
        return this.reseña;
    }
    public int getAño() {
        return this.año;
    }
}
