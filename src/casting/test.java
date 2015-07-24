package casting;

/**
 * Created by Juan Daniel on 19/07/2015.
 */
public class test {

    public static void main(String... args){
        Humano humano = new Nino();

        humano.setName("Pedro");
        System.out.println(humano.getName());

        if(humano instanceof Humano ){

            Nino a = (Nino)humano;

            a.setHablar(true);
            a.setName("Pedrito");
            System.out.println("Nombre nino: "+ a.getName() + " puede hablar: "+a.isHablar());
        }

        System.out.println(humano.getName());

        Humano person = new Adulto();
        person.setEdad(21);

        System.out.println("======");
        System.out.println(person.getEdad());

        if(person instanceof Humano){
            //DE ESTA MANERA, PODREMOS EJECUTAR SUS FUNCIONES PROPIAS SIN NECESIDAD DE DECLARARLAS EN EL SUPER CLASS
            Adulto e = (Adulto)person;
            e.currar();
            System.out.println("es hijo");
        }

        System.out.println("==============");

        Humano peque = new Nino();
        peque.setName("Markitos");
        peque.setEdad(2);
        if (peque instanceof Humano){
            Nino c = (Nino)peque;
            c.futbol();
            c.setHablar(true);
            System.out.println("Soy "+ c.getName() + " tengo "+ c.getEdad()+ " y puedo hablar: "+c.isHablar());
        }
    }





}
