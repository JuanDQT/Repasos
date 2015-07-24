package interfaz;

import java.util.Date;

/**
 * Created by Juan Daniel on 09/07/2015.
 */
public class Persona {
    String nombre;
    String apellido;
    Date dt_ini;
    String oficio;
    Double salario;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getDt_ini() {
        return dt_ini;
    }

    public void setDt_ini(Date dt_ini) {
        this.dt_ini = dt_ini;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
