/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startrek.starwars;

import interfaces.PrincipalView;
import interfaces.SimulationView;
import interfaces.Yes;
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
        //los personajes vienen del txt
        Lista listasw= new Lista();
        Lista listast= new Lista();
        Administrador admin = new Administrador(listasw,listast);
         
         
        
        Personaje pjw1,pjw2,pjw3,pjt1,pjt2,pjt3;
        pjw1 = new Personaje(1,"A",sw);
        pjw1.DefinirCalidad();
        pjt1 = new Personaje(2, "B", st);
        pjt1.DefinirCalidad();
        pjw1.setPrioridad(1);
        pjt1.setPrioridad(1);
        Nodo n1= new Nodo(pjw1);
        Nodo n2= new Nodo(pjt1);
        
        pjw2 = new Personaje(1,"A",sw);
        pjw2.DefinirCalidad();
        pjt2 = new Personaje(2, "B", st);
        pjt2.DefinirCalidad();
        pjw2.setPrioridad(2);
        pjt2.setPrioridad(2);
        Nodo n3= new Nodo(pjw2);
        Nodo n4= new Nodo(pjt2);
        
        pjw3 = new Personaje(1,"A",sw);
        pjw3.DefinirCalidad();
        pjt3 = new Personaje(2, "B", st);
        pjt3.DefinirCalidad();
        pjw3.setPrioridad(3);
        pjt3.setPrioridad(3);
        
        Nodo n5= new Nodo(pjw3);
        Nodo n6= new Nodo(pjt3);
        
        //for (int i=1;i<6;i++){
            listasw.addAtTheStart(n1);
            listast.addAtTheStart(n2);
            listasw.addAtTheStart(n3);
            listast.addAtTheStart(n4);
            listasw.addAtTheStart(n5);
            listast.addAtTheStart(n6);
       // }
       
      
       ia = new IA(tiempo,admin);
       
       admin.Nuevospj();
       admin.Nuevospj();
       admin.Nuevospj();
       //INTERFAZ
        SimulationView simulation = new SimulationView();
        Yes yes = new Yes(simulation, admin);
        yes.start();
        simulation.setVisible(true);
        for (int i=0;i<3;i++){
            
        ia.startIA();
        
        }
        
        
        
        
        
        
        
      
       
    }
    
}
