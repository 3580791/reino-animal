package es.iesjoseplanes.ed1dawdist.tarea4;

public class Animal {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    String ToString() {
        return this.getNombre();
    }
}
