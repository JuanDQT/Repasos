package SetyList.ArrayList.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by Juan Daniel on 19/07/2015.
 */
class Registro implements Comparable<Registro>{
    private String nombre;

    public Registro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Registro o) {
        return nombre.compareTo(o.getNombre());
    }
}

public class TreeSett {
    public static void main(String ... a){
        TreeSet<String> abecedarios = new TreeSet<>();
        abecedarios.add("t");
        abecedarios.add("e");
        abecedarios.add("h");
        System.out.println("Tamany: " + abecedarios.size());

        show(abecedarios,"ORDEN ASCENDIENTE DE TODA LA VIDA");

        ///////////
        ArrayList<Registro> registros = new ArrayList<>();
        registros.add(new Registro("Marcos"));
        registros.add(new Registro("Perez"));
        registros.add(new Registro("Ariel"));

        Collections.sort(registros);

        for(Registro r: registros){
            System.out.println(r.getNombre());
        }
    }

    public static void show(TreeSet<String> abecedarios, String text){
        for(String a: abecedarios){
            System.out.println(a);
        }
    }
}
