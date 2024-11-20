/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startrek.starwars;

import interfaces.SimulationView;
import interfaces.Yes;
import java.io.IOException;
import primitives.*;

/**
 *
 * @author rgabr
 */
public class StartrekStarwars extends Thread{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        IA ia;
        Saga sw, st;
        //se crean las sagas
        sw= new Saga("Star Wars");
        st = new Saga("Star Trek");
        //tiempo de cada segundo
        double tiempo=0.5;
        //los personajes 
        Lista listasw= new Lista();
        Lista listast= new Lista();
        Personaje p = new Personaje();
      
        p.leerDatos(listasw, listast, sw, st);
        Administrador admin = new Administrador(listasw,listast);

        for (int i=0;i<41;i++){
           admin.Nuevospj();
        }
       
        ia = new IA(tiempo,admin);

        //INTERFAZ
        SimulationView simulation = new SimulationView();
        Yes yes = new Yes(simulation, admin, ia, sw, st);
        yes.start();
        simulation.setVisible(true);
        while (true){
        
        ia.startIA();
        admin.Revision();
        
        }     
    }   
}