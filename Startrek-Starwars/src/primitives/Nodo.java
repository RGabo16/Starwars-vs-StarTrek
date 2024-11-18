/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitives;

import startrek.starwars.Personaje;

/**
 *
 * @author Luriannys Junco
 */
public class Nodo {
    private Personaje element;
    private Nodo pNext;
    private String palabra;

    public Nodo(Personaje element, Nodo pNext) {
        this.element = element;
        this.pNext = pNext;
        this.palabra = "";
    }

    public Nodo(String palabra){
        this.palabra = palabra;
        this.element = null;
        this.pNext = null;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public Nodo(Personaje element) {
        this.element = element;
        this.pNext = null;
    }

    /**
     * @return the element
     */
    public Personaje getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Personaje element) {
        this.element = element;
    }

    /**
     * @return the pNext
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
    
    
    
    
    
    
    
    
    
}
