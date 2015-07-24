package grande;

/**
 * Created by Juan Daniel on 16/07/2015.
 */
public class Jefe extends Persona{
    @Override
    void hola() {
        System.out.println("Soy un jefe");
    }

    enum Logros{A,B,C}
    private Logros logros;

    public void jefePersonalizada(){
        System.out.println("Soy jefe y me toco el mono");
    }

    public Logros getLogros() {
        return logros;
    }

    public void setLogros(Logros logros) {
        this.logros = logros;
    }
}
