/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startrek.starwars;
import javax.swing.DefaultListModel;
import primitives.*;
/**
 *
 * @author rgabr
 */
public class Administrador {

    int ciclos; //cada 2 ciclos agrega dos personajes a sus respectivas colas
    Cola cola1SW;
    Cola cola1ST;
    Cola cola2SW;
    Cola cola2ST;
    Cola cola3SW;
    Cola cola3ST;
    Cola colaRSW;
    Cola colaRST;
    Lista listasw;
    Lista listast;

    public Administrador(Lista sw,Lista st) {
        this.listasw=sw;
        this.listast=st;
    }

    public Administrador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void Nuevospj(){
        //toma dos pj y los mete en sus colas
        
          int numsw=this.getListasw().getpFirst().getElement().getPrioridad();
            switch (numsw) {
                case 1 ->{
                    this.getCola1SW().queue(this.getListasw().getpFirst());
                    this.getListasw().DeleteAtTheStart();
                    //encolar en prio1 de sw
                }
                case 2 -> {
                    this.getCola2SW().queue(this.getListasw().getpFirst());
                    this.getListasw().DeleteAtTheStart();
                }
                default -> {
                    this.getCola3SW().queue(this.getListasw().getpFirst());
                    this.getListasw().DeleteAtTheStart();
                }
            }
            int numst=this.getListast().getpFirst().getElement().getPrioridad();
            switch (numst) {
                case 1 ->{
                    this.getCola1ST().queue(this.getListast().getpFirst());
                    this.getListast().DeleteAtTheStart();
                    //encolar en prio1 de sw
                }
                case 2 -> {
                    this.getCola2ST().queue(this.getListast().getpFirst());
                    this.getListast().DeleteAtTheStart();
                }
                default -> {
                    this.getCola3ST().queue(this.getListast().getpFirst());
                    this.getListast().DeleteAtTheStart();
                }
            }
        
    }
    public void Revision(){
        //80% de si entran o no 
        
        if (ciclos==2){
          int numrandom=(int)(Math.random()*10+1);
          if (numrandom>2){
              this.Nuevospj();
          }
            
        }
        
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    public Cola getCola1SW() {
        return cola1SW;
    }

    public void setCola1SW(Cola cola1SW) {
        this.cola1SW = cola1SW;
    }

    public Cola getCola1ST() {
        return cola1ST;
    }

    public void setCola1ST(Cola cola1ST) {
        this.cola1ST = cola1ST;
    }

    public Cola getCola2SW() {
        return cola2SW;
    }

    public void setCola2SW(Cola cola2SW) {
        this.cola2SW = cola2SW;
    }

    public Cola getCola2ST() {
        return cola2ST;
    }

    public void setCola2ST(Cola cola2ST) {
        this.cola2ST = cola2ST;
    }

    public Cola getCola3SW() {
        return cola3SW;
    }

    public void setCola3SW(Cola cola3SW) {
        this.cola3SW = cola3SW;
    }

    public Cola getCola3ST() {
        return cola3ST;
    }

    public void setCola3ST(Cola cola3ST) {
        this.cola3ST = cola3ST;
    }

    public Cola getColaRSW() {
        return colaRSW;
    }

    public void setColaRSW(Cola colaRSW) {
        this.colaRSW = colaRSW;
    }

    public Cola getColaRST() {
        return colaRST;
    }

    public void setColaRST(Cola colaRST) {
        this.colaRST = colaRST;
    }

    public Lista getListasw() {
        return listasw;
    }

    public void setListasw(Lista listasw) {
        this.listasw = listasw;
    }

    public Lista getListast() {
        return listast;
    }

    public void setListast(Lista listast) {
        this.listast = listast;
    }
    
    public DefaultListModel getModeloNames(Cola cola){
        
        DefaultListModel modelo = new DefaultListModel();
            
            Nodo head = cola.getHead();
            String headName = head.getElement().getNombre();
            modelo.addElement(head);
            Nodo elemento = head.getpNext();
            String elementoName = elemento.getElement().getNombre();
            modelo.addElement(elementoName);
            for(int i = 2; i<= cola.getSize(); i++){
                elemento = elemento.getpNext();
                elementoName = elemento.getElement().getNombre();
                modelo.addElement(elementoName);
            }
            return modelo;
    }
}
