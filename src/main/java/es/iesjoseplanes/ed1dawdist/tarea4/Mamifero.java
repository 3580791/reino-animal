package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Clase que representa un mamífero.
 * Los mamíferos se reproducen de manera vivípara.
 */
public class Mamifero extends Animal {

    /**
     * Constructor de la clase Mamifero.
     * @param nombre Nombre del mamífero.
     */
    public Mamifero(String nombre) {
        super(nombre);
    }

    /**
     * Método que indica cómo se reproducen los mamíferos.
     * Muestra un mensaje indicando que su reproducción es vivípara.
     */
    @Override
    void reproducir() {
        System.out.println("La reproducción es vivípara");
    }

    /**
     * Método que relaciona al mamífero con otro animal.
     * @param m El animal con el que se está relacionando.
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamífero: " + m.getNombre());
    }
}
