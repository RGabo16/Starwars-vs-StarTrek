/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitives;

import java.util.HashSet;
import javax.swing.DefaultListModel;

/**
 *
 * @author Luriannys Junco
 */
public class Cola {
    
    private Nodo head;
    private Nodo tail;
    private int size;

    /**
     * Constructor
     */
    public Cola() {
        this.head = this.tail = null;
        this.size = 0;
    }
    
    /**
     * Para saber si esta vacia
     * @return 
     */
    public boolean isEmpty(){
        return getHead() == null;
    }
    
    /**
     * Para vaciar la cola
     */
    public void empty(){
        this.setHead(this.tail = null);
        this.setSize(0);
    }
    
    /**
     * Para desencolar
     */
    public void dequeue(){
        if (this.isEmpty()){
            System.out.println("La cola esta vacia");
        } else if (getSize() == 1){
            this.empty();
        } else {
            setHead(getHead().getpNext());
            setSize(getSize() - 1);
        }
    }
    
    /**
     * Para encolar
     * @param nuevo 
     */
    public void queue(Nodo nuevo){
        if (this.isEmpty()){
            this.setHead(nuevo);
            this.setTail(nuevo);
        } else {
            getTail().setpNext(nuevo);
            setTail(nuevo);
            nuevo.setpNext(null);
        }
        setSize(getSize() + 1);
    }
    
    /**
     * Para imprimir la cola
     * @return printQueue
     */
    public String print(){
        if (!this.isEmpty()){
            String printQueue = "";
            for (int i = 0; i < getSize(); i++){
                Nodo actual = getHead();
                dequeue();
                printQueue += actual.getElement() + ",";
                queue(actual);
            }
            return printQueue;
        }
        return null;
    }

    /**
     * @return the head
     */
    public Nodo getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Nodo head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Nodo getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
   
}
