package interfaz;

/**
 * Created by Juan Daniel on 09/07/2015.
 */
 class Abogado extends Persona implements Boli{

    public void escribir() {
        System.out.println("El abogado escribe con un boli de longitud "+longitud);
    }
}
