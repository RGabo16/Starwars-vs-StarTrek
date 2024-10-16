/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startrek.starwars;

/**
 *
 * @author rgabr
 */
public class Saga {
     Personaje personaje;// posible lista de personajes
    String Nombre;

    public Saga(Personaje personaje, String Nombre) {
        this.personaje = personaje;
        this.Nombre = Nombre;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
