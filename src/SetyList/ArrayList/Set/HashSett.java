package SetyList.ArrayList.Set;

import java.util.HashSet;

/**
 * Created by Juan Daniel on 19/07/2015.
 * OBJETOS DESORDENADOS
 */
class Movil{
    private String name;

    public Movil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class HashSett {
    public static void main(String... args){
        HashSet<Movil> movils = new HashSet<>();
        movils.add(new Movil("Motorola"));
        movils.add(new Movil("Samsung"));
        movils.add(new Movil("iPhone"));

        System.out.println("HashSet: objetos desordenado\nTamany: "+movils.size());
        show(movils, "TODO");

    }

    public static void show(HashSet<Movil> movils, String text){
        System.out.println("["+text+"]");
        for(Movil m: movils){
            System.out.println(m.getName());
        }
    }
}
