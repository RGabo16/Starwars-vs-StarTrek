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
    Cola cola1SW = new Cola();
    Cola cola1ST = new Cola();
    Cola cola2SW = new Cola();
    Cola cola2ST = new Cola();
    Cola cola3SW = new Cola();
    Cola cola3ST = new Cola();
    Cola colaRSW = new Cola();
    Cola colaRST = new Cola();
    Lista listasw;
    Lista listast;

    public Administrador(Lista sw,Lista st) {
        this.listasw=sw;
        this.listast=st;
    }

    public Administrador() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void Nuevospj(){
        //toma dos pj y los mete en sus colas
        if (!this.getListasw().isEmpty()){
            int numsw=this.getListasw().getpFirst().getElement().getPrioridad();
            switch (numsw) {
                case 1 ->{
                    this.getCola1SW().queue(this.getListasw().getpFirst());
                    this.getColaRSW().queue(this.getListasw().getpFirst());
                    this.getListasw().DeleteAtTheStart();
                    //encolar en prio1 de sw
                }
                case 2 -> {
                    this.getCola2SW().queue(this.getListasw().getpFirst());
                    this.getColaRSW().queue(this.getListasw().getpFirst());
                    this.getListasw().DeleteAtTheStart();
                    
                }
                default -> {
                    this.getCola3SW().queue(this.getListasw().getpFirst());
                    this.getColaRSW().queue(this.getListasw().getpFirst());
                    this.getListasw().DeleteAtTheStart();
                }
            }
        }
        if (!this.getListast().isEmpty()){
             int numst=this.getListast().getpFirst().getElement().getPrioridad();
            switch (numst) {
                case 1 ->{
                    this.getCola1ST().queue(this.getListast().getpFirst());
                    this.getColaRST().queue(this.getListast().getpFirst());
                    this.getListast().DeleteAtTheStart();
                    //encolar en prio1 de sw
                }
                case 2 -> {
                    this.getCola2ST().queue(this.getListast().getpFirst());
                    this.getColaRST().queue(this.getListast().getpFirst());
                    this.getListast().DeleteAtTheStart();
                }
                default -> {
                    this.getCola3ST().queue(this.getListast().getpFirst());
                    this.getColaRST().queue(this.getListast().getpFirst());
                    this.getListast().DeleteAtTheStart();
                }
            }
        }  System.out.println("Listas vacias");
           
        
    }
    public void Revision(){
        //80% de si entran o no 
        
        if (ciclos%2==0){
          int numrandom=(int)(Math.random()*10);
          if (numrandom>2){
              this.Nuevospj();
            }       
          if (numrandom>6){
              this.getCola1ST().queue(this.getColaRST().getHead());
              this.getCola1SW().queue(this.getColaRSW().getHead());
              this.getColaRST().dequeue();
              this.getColaRSW().dequeue();
          }else{
              this.getColaRST().setTail(this.getColaRST().getHead());
              this.getColaRSW().setTail(this.getColaRSW().getHead());
              this.getColaRST().dequeue();
              this.getColaRSW().dequeue();
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
    
    public DefaultListModel getAtributo (Cola cola, String tipo){
        
        DefaultListModel modelo = new DefaultListModel();
        
        // Verifica que la cola no este vacia
        if (!cola.isEmpty()){
            Nodo elemento = cola.getHead();
            
            //Atributo Nombre
            if ("nombre".equals(tipo)){
                    String elementoName = elemento.getElement().getNombre();
                    modelo.addElement(elementoName);
                
                // Verifica que haya mas elementos
                while (elemento.getpNext() != null){
                    elemento = elemento.getpNext();
                    elementoName = elemento.getElement().getNombre();
                    modelo.addElement(elementoName);
                }
            }
            
            //Atributo Agilidad
            if ("agilidad".equals(tipo)){
                    int elementoAgilidad = elemento.getElement().getAgilidad();
                    modelo.addElement(elementoAgilidad);
                
                // Verifica que haya mas elementos
                while (elemento.getpNext() != null){
                    elemento = elemento.getpNext();
                    elementoAgilidad = elemento.getElement().getAgilidad();
                    modelo.addElement(elementoAgilidad);
                }
            }

            //Atributo Habilidad
            if ("habilidad".equals(tipo)){
                int elementoHabilidad = elemento.getElement().getHabilidad();
                modelo.addElement(elementoHabilidad);
                
                // Verifica que haya mas elementos
                while (elemento.getpNext() != null){
                    elemento = elemento.getpNext();
                    elementoHabilidad = elemento.getElement().getHabilidad();
                    modelo.addElement(elementoHabilidad);
                }
            }

            //Atributo Fuerza
            if ("fuerza".equals(tipo)){
                int elementoFuerza = elemento.getElement().getFuerza();
                modelo.addElement(elementoFuerza);

               // Verifica que haya mas elementos
                while (elemento.getpNext() != null){
                    elemento = elemento.getpNext();
                    elementoFuerza = elemento.getElement().getFuerza();
                    modelo.addElement(elementoFuerza);
                }
            
            }

            //Atributo Vida
            if ("vida".equals(tipo)){
                int elementoVida = elemento.getElement().getVida();
                modelo.addElement(elementoVida);
                
                // Verifica que haya mas elementos
                while (elemento.getpNext() != null){
                    elemento = elemento.getpNext();
                    elementoVida = elemento.getElement().getVida();
                    modelo.addElement(elementoVida);
                }
            }
        }      
        return modelo;
    }
    
    public void contadorPersonaje (Cola cola){
                
        // Verifica que la cola no este vacia
        if (!cola.isEmpty()){
            Nodo elemento = cola.getHead();  
            elemento.getElement().setContador(elemento.getElement().getContador() + 1);
            elemento.getElement().Inanicion();

            // Verifica que haya mas elementos
            while (elemento.getpNext() != null){
                elemento = elemento.getpNext();
                elemento.getElement().setContador(elemento.getElement().getContador() + 1);
                elemento.getElement().Inanicion();
            }
        }
    }
}
