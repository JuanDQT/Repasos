package casting;

/**
 * Created by Juan Daniel on 19/07/2015.
 */
public class Adulto extends Humano implements Trabajar{
    private boolean discapacidad;

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    @Override
    public void currar() {
        System.out.println("Curro demasiao");
    }

    public void jaja(){
        System.out.println("Soy un trolazo");
    }
}
