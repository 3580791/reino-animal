package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Esta clase representa un animal en general.
 * Todos los animales tienen un nombre y pueden realizar acciones como comer, dormir, reproducirse y relacionarse.
 */
public class Animal {
    
    /**
     * Este es el nombre del animal.
     */
    private String nombre;

    /**
     * Este es el constructor de la clase Animal.
     * Sirve para crear un nuevo animal con un nombre.
     * @param nombre Es el nombre que tendrá el animal.
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método devuelve el nombre del animal.
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método cambia el nombre del animal.
     * @param nombre Es el nuevo nombre que tendrá el animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método hace que el animal coma.
     * Muestra un mensaje en la pantalla diciendo que el animal necesita comer.
     */
    void comer() {
        System.out.println("Necesita comer diariamente para sobrevivir");
    }

    /**
     * Este método hace que el animal duerma.
     * Muestra un mensaje en la pantalla diciendo que el animal necesita descansar.
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Este método representa la reproducción del animal.
     * Muestra un mensaje en la pantalla diciendo que el animal puede originar nuevos seres vivos.
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     * Este método hace que un animal se relacione con otro.
     * Muestra un mensaje indicando con qué otro animal se está relacionando.
     * @param a Es el otro animal con el que se relaciona.
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    /**
     * Este método sirve para convertir el animal en un texto con su nombre.
     * @return Devuelve el nombre del animal en forma de texto.
     */
    @Override
    public String toString() {
        return this.getNombre();
    }
}
