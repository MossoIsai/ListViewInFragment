package models;

/**
 * Created by isaigarciamoso on 11/03/17.
 */

public class Familia {
    private String nombre;

    public Familia(String nombre) {
        this.nombre = nombre;
    }
    public Familia(){

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
