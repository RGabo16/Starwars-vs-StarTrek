/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startrek.starwars;

import interfaces.PrincipalView;
import interfaces.SimulationView;
import interfaces.Yes;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import primitives.*;

/**
 *
 * @author rgabr
 */
public class StartrekStarwars extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       // PrincipalView main = new PrincipalView();
        //main.setVisible(true);

        
        
        IA ia;
        Thread t0;
        Saga sw, st;
        //se crean las sagas
        sw= new Saga("Star Wars");
        st = new Saga("Star Trek");
        //timepo de cada segundo
        double tiempo=0.5;
        //los personajes 
        Lista listasw= new Lista();
        Lista listast= new Lista();
        Personaje p = new Personaje();
      
        p.leerDatos(listasw, listast, sw, st);
        Administrador admin = new Administrador(listasw,listast);

       for (int i=0;i<9;i++){
           admin.Nuevospj();
           
       }
       
       ia = new IA(tiempo,admin);

       //INTERFAZ
        SimulationView simulation = new SimulationView();
        Yes yes = new Yes(simulation, admin, ia, sw, st);
        yes.start();
        simulation.setVisible(true);
        for (int i=0;i<9;i++){
        
        ia.startIA();
        
        }
       
      
        
        
        
        
        
        
        
      
       
    }
      
        
    
    }

