package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Clase que representa a un gato, un tipo de mamífero.
 * Los gatos pueden maullar y dormir durante largos periodos.
 */
public class Gato extends Mamifero {

    /**
     * Cantidad de pelos del gato.
     */
    private int pelos;

    /**
     * Constructor de la clase Gato.
     * @param nombre Nombre del gato.
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Devuelve la cantidad de pelos del gato.
     * @return Número de pelos del gato.
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * Establece la cantidad de pelos del gato.
     * @param pelos Número de pelos a asignar.
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    /**
     * Método que indica cómo duerme el gato.
     * Muestra un mensaje indicando que duerme mucho tiempo.
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Método que hace que el gato maúlle.
     * Muestra un mensaje indicando que el gato maúlla.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Método que relaciona al gato con otro animal.
     * @param p El animal con el que se está relacionando.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }
}