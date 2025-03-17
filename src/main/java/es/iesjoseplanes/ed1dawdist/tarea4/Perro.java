package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Clase que representa a un perro, un tipo de mamífero.
 * Los perros pueden ladrar, gruñir y tienen un comportamiento social.
 */
public class Perro extends Mamifero {

    /**
     * Constructor de la clase Perro.
     * @param nombre Nombre del perro.
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Método que indica cómo duerme el perro.
     * Muestra un mensaje indicando que su sueño depende del ejercicio que realiza.
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en función del ejercicio que realiza");
    }

    /**
     * Método que hace que el perro ladre.
     * Muestra un mensaje indicando que el perro está ladrando.
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Método que hace que el perro gruña.
     * Muestra un mensaje indicando que el perro está gruñendo.
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Método que relaciona al perro con otro animal.
     * @param p El animal con el que se está relacionando.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }
}
