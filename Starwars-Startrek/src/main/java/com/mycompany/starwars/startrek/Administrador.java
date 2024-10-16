/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starwars.startrek;

/**
 *
 * @author rgabr
 */
public class Administrador {
    int ciclos;//cada 2 ciclos agrega un pj de cada SAGA 80%
    ColasPrioridad cola; 

    public Administrador(int ciclos) {
        this.ciclos = ciclos;
    }
    public void NuevosPjs (){
        //selecciona dos personajes de sagas distintas y los agrega a la cola correspondiente
        
    }
    
    public void Revision (){
        
        
    }

    public ColasPrioridad getCola() {
        return cola;
    }

    public void setCola(ColasPrioridad cola) {
        this.cola = cola;
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }
    
    
}
