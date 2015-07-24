package SetyList.ArrayList.ArrayListts;

import java.util.ArrayList;

/**
 * Created by Juan Daniel on 19/07/2015.
 * GET MAS RAPIDO, ITERACION RAPIDA
 */
class Temporada{
    private String nombre;
    private int duracion;



    public Temporada(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

public class ArrayListt{

    public static void main(String... args){

        ArrayList<Temporada> temporadas = new ArrayList<>();

        temporadas.add(new Temporada("Verano", 334));
        temporadas.add(new Temporada("Invierno",125));
        temporadas.add(new Temporada("Otono", 332));
        temporadas.add(new Temporada("Primavera", 458));


        show(temporadas, "[TODO]");
        temporadas.remove(0);
        show(temporadas, "[.remove]");
        temporadas.clear();
        show(temporadas, "[.clear]");

    }

    public static void show(ArrayList<Temporada> x, String text){
        System.out.println(text);
        for(Temporada t: x)
            System.out.println(t.getNombre());
    }

}
