package EnumYFechas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Juan Daniel on 15/07/2015.
 */
class Persona implements Comparable<Persona>{
    private String name;

    enum Sexo {HOMBRE,MUJER}

    private Sexo sexo;

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    private LocalDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public int compareTo(Persona o) {
        return getName().compareTo(o.getName());
    }
}


public class Test {

    public static void main(String... args) {
        Persona p = new Persona();
        p.setName("Pepe");
        p.setDate(LocalDate.of(2015, 11, 1));
        p.setSexo(Persona.Sexo.HOMBRE);

        Persona j = new Persona();
        j.setName("Alberto");
        j.setDate(LocalDate.now());
        j.setSexo(Persona.Sexo.MUJER);

        Persona k = new Persona();
        k.setName("Walter");
        k.setDate(LocalDate.of(2014, 11, 2));
        k.setSexo(Persona.Sexo.MUJER);

        ArrayList<Persona> personas= new ArrayList<>();

        personas.add(p);
        personas.add(j);
        personas.add(k);

        Collections.sort(personas);

        for (Persona x: personas)
        if (x.getSexo().equals(Persona.Sexo.HOMBRE))
            System.out.println("Soy: "+x.getName()+" y soy "+x.getSexo()+" y naci el "+ x.getDate());

    }
}
