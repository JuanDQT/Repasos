package interfaz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Daniel on 09/07/2015.
 */
public class Init {

    public static void main(String... args){
        Medico medico = new Medico();
        medico.setNombre("Marc");
        medico.setApellido("Codina");
        medico.setOficio("Cirujano");
        medico.escribir();



        Abogado abogado = new Abogado();
        abogado.setNombre("Sena");
        abogado.setApellido("Ramirez");
        abogado.setOficio("Juez");
        abogado.escribir();

        //ArrayList personas = new ArrayList();
        List<Persona> personas = new ArrayList<>();

        personas.add(medico);
        personas.add(abogado);


        for(Persona p :personas){
            System.out.println(p.getOficio());
        }

    }
}
