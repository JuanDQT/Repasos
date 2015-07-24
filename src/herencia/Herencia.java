package herencia;

/**
 * Created by Juan Daniel on 13/07/2015.
 */
class Phone {
    String keyboard = "in-built";

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
class Tablet extends Phone {

    boolean playMovie = false;

    public boolean isPlayMovie() {
        return playMovie;
    }

    public void setPlayMovie(boolean playMovie) {
        this.playMovie = playMovie;
    }
}

class Herencia {
    public static void main(String args[]) {
        Phone photha = new Tablet();
        Phone phone = new Phone();

        Tablet tablet = new Tablet();

        photha.getKeyboard();
        phone.getKeyboard();

        tablet.setPlayMovie(true);
        //System.out.println(phone.keyboard + ":" + );
    }
}