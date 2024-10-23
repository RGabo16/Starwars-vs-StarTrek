/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startrek.starwars;

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
        Cola prio1= new Cola();
        Administrador admin=new Administrador(prio1,2);
        t0=new Thread();
        ia = new IA(pj, pjs,tiempo,admin);
        ia.startIA();
       
    }
    
}
