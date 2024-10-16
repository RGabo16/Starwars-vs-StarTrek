/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startrek.starwars;

/**
 *
 * @author rgabr
 */
public class Administrador {
    Cola cola;//donde se guardan los pj
    int ciclos; //cada 2 ciclos agrega dos personajes a sus respectivas colas

    public Administrador(Cola cola, int ciclos) {
        this.cola = cola;
        this.ciclos = ciclos;
    }
    public void Nuevospj(){
        //toma dos pj y los mete en sus colas
    }
    public void Revision(){
        //80% de si entran o no 
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }
    
}
