package casting;

/**
 * Created by Juan Daniel on 19/07/2015.
 */
public class Nino extends Humano implements Jugar{
    private boolean hablar;

    public boolean isHablar() {
        return hablar;
    }

    public void setHablar(boolean hablar) {
        this.hablar = hablar;
    }

    @Override
    public void futbol() {
        System.out.println("Me gusta jugar al futbon con mis amigos");
    }
}
