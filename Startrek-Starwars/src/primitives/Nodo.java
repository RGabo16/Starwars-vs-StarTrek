/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitives;

/**
 *
 * @author Luriannys Junco
 */
public class Nodo {
    private Object element;
    private Nodo pNext;

    public Nodo(Object element, Nodo pNext) {
        this.element = element;
        this.pNext = pNext;
    }

    public Nodo(Object element) {
        this.element = element;
        this.pNext = null;
    }

    /**
     * @return the element
     */
    public Object getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Object element) {
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
