package grande;

import java.time.LocalDate;

/**
 * Created by Juan Daniel on 16/07/2015.
 */
    abstract class Persona implements Comparable<Persona>{

    private String name;
    enum Sexo{HOMBRE,MUJER}
    private Sexo sexo;
    private LocalDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    abstract void hola();

    @Override
    public int compareTo(Persona o) {
        return getName().compareTo(o.getName());
    }
}
