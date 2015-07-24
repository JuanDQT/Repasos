package SetyList.ArrayList.Set;

import java.util.LinkedHashSet;

/**
 * Created by Juan Daniel on 19/07/2015.
 * OBJETOS A MOSTRAR SEGUN ORDEN DE INSRCION
 */
class Pelicula{
    private String name;

    public Pelicula(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class LinkedHashSett {
    public static void main(String... args){
        LinkedHashSet<Pelicula> peliculas = new LinkedHashSet<>();
        peliculas.add(new Pelicula("Peter Pan"));
        peliculas.add(new Pelicula("Harry Potter"));
        peliculas.add(new Pelicula("World of Warcraft"));

        System.out.println("LinkedHashSet: el orden depende del orden de inserccion\nTamany: "+peliculas.size());
        show(peliculas,"ORDENADO SEGUND INSERCCION");
    }

        public static void show(LinkedHashSet<Pelicula> peliculaLinkedHashSett, String text){
            System.out.println("["+text+"]");
            for(Pelicula p: peliculaLinkedHashSett){
                System.out.println(p.getName());
            }
        }


}
