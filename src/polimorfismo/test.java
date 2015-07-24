package polimorfismo;

/**
 * Created by Juan Daniel on 21/07/2015.
 */

class Cuadrado implements Figura{
    private float l;

    public Cuadrado(int lado){
        this.l = lado;
    }


    @Override
    public float CalculoArea() {
        return l*l;
    }
}

class Circulo implements Figura{
    private float l;

    public Circulo(float l){
        this.l = l;
    }

    @Override
    public float CalculoArea() {
        return l*3.14f;

    }
}

public class test {
    public static void main(String... args){

        Cuadrado cuadrado = new Cuadrado(3);
        System.out.println(cuadrado.CalculoArea());

        Circulo circulo = new Circulo(3f);
        System.out.println(circulo.CalculoArea());
    }
}
