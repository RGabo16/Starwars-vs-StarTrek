/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startrek.starwars;

import interfaces.PrincipalView;
import primitives.*;

/**
 *
 * @author rgabr
 */
public class StartrekStarwars extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


        
        IA ia;
        Thread t0;
        Saga sw, st;
        sw= new Saga("Star Wars");
        st = new Saga("Star Trek");
        Personaje pj, pjs;
        pj = new Personaje(1,"A",sw);
        pj.DefinirCalidad();
        pjs = new Personaje(2, "B", st);
        pjs.DefinirCalidad();
        double tiempo=0.5;
        Nodo n1= new Nodo(pj);
        Nodo n2= new Nodo(pjs);
        Cola SW1= new Cola();
        SW1.queue(n1);
        Cola SW2= new Cola();
        Cola SW3= new Cola();
        Cola SWR= new Cola();
        
        Cola ST1= new Cola();
        ST1.queue(n2);
        Cola ST2= new Cola();
        Cola ST3= new Cola();
        Cola STR= new Cola();
        
        Administrador admin=new Administrador(SW1,ST1,2);
        ia = new IA(pj, pjs,tiempo,admin);
        ia.startIA();
        
        PrincipalView main = new PrincipalView();
        main.setVisible(true);
        
        
      
       
    }
    
}
