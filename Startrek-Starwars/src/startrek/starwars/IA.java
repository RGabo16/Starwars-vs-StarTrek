/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startrek.starwars;
import primitives.*;
        
/**
 *
 * @author rgabr
 */
public class IA {
    Personaje pj1;
    Personaje pj2;
    String resultado;
    Lista lista;

    public IA(Personaje pj1, Personaje pj2) {
        this.pj1 = pj1;
        this.pj2 = pj2;
    }

    /**Decide el ganador basandose en las habilidad, agilidad, fuerza y vida de los personajes*/
    public void DecidirGanador(){
        int puntajePj1 = 0;
        int puntajePj2 = 0;
        
        // Comparar habilidad
        if (this.getPj1().getHabilidad() > this.getPj2().getHabilidad()){
            puntajePj1++;
        } else if (this.getPj1().getHabilidad() < this.getPj2().getHabilidad()){
            puntajePj2++;
        } else{
            puntajePj1++;
            puntajePj2++;
        }
        
        // Comparar agilidad
        if (this.getPj1().getAgilidad() > this.getPj2().getAgilidad()){
            puntajePj1++;
        } else if (this.getPj1().getAgilidad() < this.getPj2().getAgilidad()){
            puntajePj2++;
        } else {
            puntajePj1++;
            puntajePj2++;
        }
        
        // Comparar fuerza
        if (this.getPj1().getFuerza() > this.getPj2().getFuerza()){
            puntajePj1++;
        } else if (this.getPj1().getFuerza() < this.getPj2().getFuerza()) {
            puntajePj2++;
        } else {
            puntajePj1++;
            puntajePj2++;
        }
        
        // Comparar vida
        if (this.getPj1().getVida() > this.getPj2().getVida()){
            puntajePj1++;
        } else if (this.getPj1().getVida() < this.getPj2().getVida()) {
            puntajePj2++;
        } else {
            puntajePj1++;
            puntajePj2++;
        }
        
        // Comparar puntajes finales
        if (puntajePj1 > puntajePj2){
            System.out.println("Jugador " +this.getPj1().getNombre()+ " gana");
        } else if (puntajePj1 == puntajePj2) {
            int decision = (int) (Math.random() * 10 + 1);
            if (decision <= 5){
                System.out.println("Jugador " +this.getPj1().getNombre()+ " gana");
            } else {
                System.out.println("Jugador " +this.getPj2().getNombre()+ " gana");
            }            
        } else {
            System.out.println("Jugador " +this.getPj2().getNombre()+ " gana");
        } 
        System.out.println("P1: "+puntajePj1+ " P2: "+ puntajePj2);
    }
    
    public Personaje getPj1() {
        return pj1;
    }

    public void setPj1(Personaje pj1) {
        this.pj1 = pj1;
    }

    public Personaje getPj2() {
        return pj2;
    }

    public void setPj2(Personaje pj2) {
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
    
   
}
