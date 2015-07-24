package ordenar_y_abstractclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class go{

    public static void main(String... args) {

        Tijera a = new Tijera();
        Cola cola = new Cola();

        a.setName("Rolmax");
        a.setCosto(23L);
        a.accion();

        cola.setName("GlueGlue");
        cola.setCosto(22L);
        cola.accion();

        List<Material> materials = new ArrayList<>();

        materials.add(a);
        materials.add(cola);

        Collections.sort(materials);

        for(Material m : materials){
            System.out.println(m.getCosto());
        }


    }
}