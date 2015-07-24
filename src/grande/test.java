package grande;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Juan Daniel on 16/07/2015.
 */
public class test{

    public static void main(String... args) {
        Empresario a = new Empresario();
        Jefe jefe = new Jefe();

        List<Persona> personas = new ArrayList<>();

        a.setName("Mario");
        a.setSexo(Persona.Sexo.HOMBRE);
        a.setDate(LocalDate.of(2015, 12, 5));
        a.setCargo(Empresario.Cargo.MEDIO);
        a.setNss(323233324L);
        a.setSalario(3878.14);
        //a.hola();

        jefe.setName("Juan Quispe");
        jefe.setDate(LocalDate.of(1993, 07, 24));
        jefe.setSexo(Persona.Sexo.HOMBRE);
        jefe.setLogros(Jefe.Logros.C);
        //jefe.hola();

        personas.add(a);
        personas.add(jefe);

        Collections.sort(personas);

        for (Persona p: personas) {
            //p.hola();
            if (p instanceof Jefe) {
                Jefe ji = (Jefe) p;
                ji.jefePersonalizada();
                //ji.hola();
                //System.out.println("Me llamo " + p.getName() + ", soy " + p.getSexo() + " y naci el " + p.getDate());
            }
        }
        }
}

