/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startrek.starwars;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import primitives.*;
        
/**
 *
 * @author rgabr
 */
public class IA extends Thread {
    Nodo pj1;
    Nodo pj2;
    String resultado;
    Lista lista;
    String estado;
    double tiempo;
    Administrador admin;
    Lista listaWin = new Lista();
    
    

    public IA(double tiempo, Administrador admin){
        
        this.tiempo=tiempo;
        this.admin=admin;
        
    }

    /**Decide el ganador basandose en las habilidad, agilidad, fuerza y vida de los personajes*/
    public void DecidirGanador(){
        int puntajePj1 = 0;
        int puntajePj2 = 0;
        try {
            this.setResultado("Decidiendo Ganador");
              Thread.sleep(Duration.ofSeconds((long)(tiempo*5)));
            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        // Comparar habilidad
        if (this.getPj1().getElement().getHabilidad() > this.getPj2().getElement().getHabilidad()){
            puntajePj1++;
        } else if (this.getPj1().getElement().getHabilidad() < this.getPj2().getElement().getHabilidad()){
            puntajePj2++;
        } else{
            puntajePj1++;
            puntajePj2++;
        }
        
        // Comparar agilidad
        if (this.getPj1().getElement().getAgilidad() > this.getPj2().getElement().getAgilidad()){
            puntajePj1++;
        } else if (this.getPj1().getElement().getAgilidad() < this.getPj2().getElement().getAgilidad()){
            puntajePj2++;
        } else {
            puntajePj1++;
            puntajePj2++;
        }
        
        // Comparar fuerza
        if (this.getPj1().getElement().getFuerza() > this.getPj2().getElement().getFuerza()){
            puntajePj1++;
        } else if (this.getPj1().getElement().getFuerza() < this.getPj2().getElement().getFuerza()) {
            puntajePj2++;
        } else {
            puntajePj1++;
            puntajePj2++;
        }
        
        // Comparar vida
        if (this.getPj1().getElement().getVida() > this.getPj2().getElement().getVida()){
            puntajePj1++;
        } else if (this.getPj1().getElement().getVida() < this.getPj2().getElement().getVida()) {
            puntajePj2++;
        } else {
            puntajePj1++;
            puntajePj2++;
        }
        
        // Comparar puntajes finales
        if (puntajePj1 > puntajePj2){
            System.out.println("Jugador " +this.getPj1().getElement().getNombre()+ " gana");
            this.resultado=this.getPj1().getElement().getNombre()+" gana";
            this.getListaWin().addAtTheStart(pj1);
            this.getPj1().getElement().getSaga().setPuntos(this.getPj1().getElement().getSaga().getPuntos()+1);
            
        } else if (puntajePj1 == puntajePj2) {
            int decision = (int) (Math.random() * 10 + 1);
            if (decision <= 5){
                System.out.println("Jugador " +this.getPj1().getElement().getNombre()+ " gana");
                this.resultado=this.getPj1().getElement().getNombre()+" gana";
                this.getListaWin().addAtTheStart(pj1);
                this.getPj1().getElement().getSaga().setPuntos(this.getPj1().getElement().getSaga().getPuntos()+1);
                

            } else {
                System.out.println("Jugador " +this.getPj2().getElement().getNombre()+ " gana");
                this.resultado=this.getPj2().getElement().getNombre()+" gana";
                this.getListaWin().addAtTheStart(pj2);
                this.getPj2().getElement().getSaga().setPuntos(this.getPj2().getElement().getSaga().getPuntos()+1);
            }            
        } else {
            System.out.println("Jugador " +this.getPj2().getElement().getNombre()+ " gana");
            this.resultado=this.getPj2().getElement().getNombre()+" gana";
            this.getListaWin().addAtTheStart(pj2);
            this.getPj2().getElement().getSaga().setPuntos(this.getPj2().getElement().getSaga().getPuntos()+1);
        } 
       
        this.getAdmin().getColaRST().queue(pj1);
        this.getAdmin().getColaRSW().queue(pj2);
        System.out.println("P2: "+puntajePj2+ " P1: "+ puntajePj1);
        System.out.println("SW: "+this.getPj2().getElement().getSaga().getPuntos()+" ST: "+this.getPj1().getElement().getSaga().getPuntos());//siempre el pj2 es de ST
    }
    public void startIA(){
       // while(this.getAdmin().getCola1ST().getSize()>0 || this.getAdmin().getCola1ST().getSize()>0){
            
      //  }
        if (this.getAdmin().getCola1ST().getSize()>0 && this.getAdmin().getCola1SW().getSize()>0){
            this.pj1 = this.getAdmin().getCola1ST().getHead();
            this.pj2 = this.getAdmin().getCola1SW().getHead();
            this.getAdmin().getCola1ST().dequeue();
            this.getAdmin().getCola1SW().dequeue();
            
        
        }else if(this.getAdmin().getCola2ST().getSize()>0 && this.getAdmin().getCola2SW().getSize()>0){
            this.pj1 = this.getAdmin().getCola2ST().getHead();
            this.pj2 = this.getAdmin().getCola2SW().getHead();
            this.getAdmin().getCola2ST().dequeue();
            this.getAdmin().getCola2SW().dequeue();
            
        }else if(this.getAdmin().getCola3ST().getSize()>0 && this.getAdmin().getCola3SW().getSize()>0){
            
            this.pj1 = this.getAdmin().getCola3ST().getHead();
            this.pj2 = this.getAdmin().getCola3SW().getHead();
            this.getAdmin().getCola3ST().dequeue();
            this.getAdmin().getCola3SW().dequeue();
        }
        
        try {
            this.setResultado("Decidiendo...");
              Thread.sleep(Duration.ofSeconds((long)(tiempo*5)));
            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }
        float num=(int)(Math.random()*10);
        if (num <=4){
            //4
            //40% de que alguien gane 
            this.DecidirGanador();
        }else if (num<=6.7){
            //6.7
            try {
            this.setResultado("Empate");
              Thread.sleep(Duration.ofSeconds((long)(tiempo*5)));
            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(this.getResultado());
            this.getAdmin().getCola1SW().queue(pj2);
            this.getAdmin().getCola1ST().queue(pj1);
            
            
        }else{
            try {
            this.setResultado("Pelea Cancelada");
              Thread.sleep(Duration.ofSeconds((long)(tiempo*5)));
            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(this.getResultado());
            this.getAdmin().getColaRSW().queue(pj2);
            this.getAdmin().getColaRST().queue(pj1);
        }
        
        System.out.println("num: " +num);
        /*this.getAdmin().contadorPersonaje(this.getAdmin().getCola1SW());
        this.getAdmin().contadorPersonaje(this.getAdmin().getCola1ST());
        this.getAdmin().contadorPersonaje(this.getAdmin().getCola2ST());
        this.getAdmin().contadorPersonaje(this.getAdmin().getCola3ST());
        this.getAdmin().contadorPersonaje(this.getAdmin().getCola2SW());
        this.getAdmin().contadorPersonaje(this.getAdmin().getCola3SW());
        this.getAdmin().setCiclos(this.getAdmin().getCiclos()+1);*/
        //aumentar todos los contadores de los personajes 
       
    }
    public Nodo getPj1() {
        return pj1;
    }

    public void setPj1(Nodo pj1) {
        this.pj1 = pj1;
    }

    public Nodo getPj2() {
        return pj2;
    }

    public void setPj2(Nodo pj2) {
        this.pj2 = pj2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Lista getListaWin() {
        return listaWin;
    }

    public void setListaWin(Lista listaWin) {
        this.listaWin = listaWin;
    }
    
 
    
   
}
