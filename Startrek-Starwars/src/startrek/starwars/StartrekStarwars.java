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
      
        Personaje pjw1,pjw2,pjw3,pjw4,pjw5,pjw6,pjw7,pjw8,pjw9,pjw10,pjw11;
        Personaje pjt1,pjt2,pjt3,pjt4,pjt5,pjt6,pjt7,pjt8,pjt9,pjt10,pjt11;
        Nodo n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22;
       
            pjw1 = new Personaje(1,"Anakin Skywalker",sw, "/images/Anakin Skywalker star wars.png");
            pjw1.DefinirCalidad();
            pjt1 = new Personaje(2, "Data", st, "/images/Data star trek.jpg");
            pjt1.DefinirCalidad();
                        
            pjw2 = new Personaje(1,"C-3PO",sw, "/images/C-3PO star wars.jpg");
            pjw2.DefinirCalidad();
            pjt2 = new Personaje(2, "Beverly Crusher", st, "/images/Beverly Crusher star trek.jpg");
            pjt2.DefinirCalidad();
            
            pjw3 = new Personaje(1,"ChewBacca",sw, "/images/ChewBacca star wars.jpg");
            pjw3.DefinirCalidad();
            pjt3 = new Personaje(2, "Deanna Troi", st, "/images/Deanna Troi star trek.png");
            pjt3.DefinirCalidad();
            
            pjw4 = new Personaje(1,"Darth Vader",sw, "/images/Darth Vader star wars.jpg");
            pjw4.DefinirCalidad();
            pjt4 = new Personaje(2, "Geordi La Forge", st, "/images/Geordi La Forge star trek.jpg");
            pjt4.DefinirCalidad();
            
            pjw5 = new Personaje(1,"Emperador Palpatine",sw, "/images/Emperador Palpatine star wars.jpg");
            pjw5.DefinirCalidad();
            pjt5 = new Personaje(2, "Guinan", st, "/images/Guinan star trek.jpg");
            pjt5.DefinirCalidad();
            
            pjw6 = new Personaje(1,"Finn",sw, "/images/Finn star wars.jpg");
            pjw6.DefinirCalidad();
            pjt6 = new Personaje(2, "James T.Kirk", st, "/images/James T. Kirk star trek.jpg");
            pjt6.DefinirCalidad();
            
            pjw7 = new Personaje(1,"Han Solo",sw, "/images/Han Solo star wars.jpg");
            pjw7.DefinirCalidad();
            pjt7 = new Personaje(2, "Hikaru Sulu", st, "/images/Hikaru Sulu star trek.jpg");
            pjt7.DefinirCalidad();
            
            pjw8 = new Personaje(1,"Jabba the Hutt",sw, "/images/Jabba the Hutt star wars.jpg");
            pjw8.DefinirCalidad();
            pjt8 = new Personaje(2, "Jean-Luc Picard", st, "/images/Jean-Luc Picard star trek.jpg");
            pjt8.DefinirCalidad();
            
            pjw9 = new Personaje(1,"Kylo Ren",sw, "/images/Kylo Ren star wars.jpg");
            pjw9.DefinirCalidad();
            pjt9 = new Personaje(2, "Katherine Pulaski", st, "/images/Katherine Pulaski star trek.jpg");
            pjt9.DefinirCalidad();
            
            pjw10 = new Personaje(1,"Lando Calrissian",sw, "/images/Lando Calrissian star wars.jpg");
            pjw10.DefinirCalidad();
            pjt10 = new Personaje(2, "Leonard McCoy", st, "/images/Leonard McCoy star trek.jpg");
            pjt10.DefinirCalidad();
            
            pjw11 = new Personaje(1,"Leia Organa",sw, "/images/Leia Organa star wars.jpg");
            pjw11.DefinirCalidad();
            pjt11 = new Personaje(2, "Lore", st, "/images/Lore star trek.jpg");
            pjt11.DefinirCalidad();
            
            n1= new Nodo(pjw1);
            n2= new Nodo(pjt1);
            n3= new Nodo(pjw2);
            n4= new Nodo(pjt2);
            n5= new Nodo(pjw3);
            n6= new Nodo(pjt3);
            n7= new Nodo(pjw4);
            n8= new Nodo(pjt4);
            n9= new Nodo(pjw5);
            n10= new Nodo(pjt5);
            n11= new Nodo(pjw6);
            n12= new Nodo(pjt6);
            n13= new Nodo(pjw7);
            n14= new Nodo(pjt7);
            n15= new Nodo(pjw8);
            n16= new Nodo(pjt8);
            n17= new Nodo(pjw9);
            n18= new Nodo(pjt9);
            n19= new Nodo(pjw10);
            n20= new Nodo(pjt10);
            n21= new Nodo(pjw11);
            n22= new Nodo(pjt11);
            
            listasw.addAtTheStart(n1);
            listast.addAtTheStart(n2);
            listasw.addAtTheStart(n3);
            listast.addAtTheStart(n4);
            listasw.addAtTheStart(n5);
            listast.addAtTheStart(n6);
            listasw.addAtTheStart(n7);
            listast.addAtTheStart(n8);
            listasw.addAtTheStart(n9);
            listast.addAtTheStart(n10);
            listasw.addAtTheStart(n11);
            listast.addAtTheStart(n12);
            listasw.addAtTheStart(n13);
            listast.addAtTheStart(n14);
            listasw.addAtTheStart(n15);
            listast.addAtTheStart(n16);
            listasw.addAtTheStart(n17);
            listast.addAtTheStart(n18);
            listasw.addAtTheStart(n19);
            listast.addAtTheStart(n20);
            listasw.addAtTheStart(n21);
            listast.addAtTheStart(n22);
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

