package REPASO;


class Cuerpo{
    private int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void peo(){
        System.out.println("Un peo muy debil");
    }
}

class Brazo extends Cuerpo {
    public int dedos;

    public int getDedos() {
        return dedos;
    }

    public void setDedos(int dedos) {
        this.dedos = dedos;
    }

    public void peo(){
        System.out.println("Un peo muy fuerte");
    }
}


public class Pregunta {

    public static void main(String... args) {
        Cuerpo c = new Brazo();
        System.out.println(c.getPeso());
    }
}
