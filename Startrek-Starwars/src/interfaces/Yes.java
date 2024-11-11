/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import primitives.Cola;
//import primitives.Nodo;
import startrek.starwars.Administrador;

/**
 *
 * @author Luriannys Junco
 */
public class Yes extends Thread{
    
    private SimulationView simulation;
    private Administrador admin;

    public Yes(SimulationView simulation, Administrador admin) {
        this.simulation = simulation;
        this.admin = admin;
    }

    @Override
    public void run(){
    
        while(true){
            // Cola SW 1
            DefaultListModel modeloSW1 = new DefaultListModel();
            modeloSW1 = admin.getAtributo(admin.getCola1SW(), "nombre");
            simulation.getSwCola1().setModel(modeloSW1);
          
            // Cola SW 2
            DefaultListModel modeloSW2 = new DefaultListModel();
            modeloSW2 = admin.getAtributo(admin.getCola2SW(), "nombre");
            simulation.getSwCola2().setModel(modeloSW2);
            
            // Cola SW 3
            DefaultListModel modeloSW3 = new DefaultListModel();
            modeloSW3 = admin.getAtributo(admin.getCola3SW(), "nombre");
            simulation.getSwCola3().setModel(modeloSW3);
            
            // Cola SW refuerzo
            DefaultListModel modeloSWrefuerzo = new DefaultListModel();
            modeloSW3 = admin.getAtributo(admin.getColaRSW(), "nombre");
            simulation.getSwColaRefuerzo().setModel(modeloSWrefuerzo);
            
            // Cola ST 1
            DefaultListModel modeloST1 = new DefaultListModel();
            modeloST1 = admin.getAtributo(admin.getCola1ST(), "nombre");
            simulation.getStCola1().setModel(modeloST1);
            
            // Cola ST 2
            DefaultListModel modeloST2 = new DefaultListModel();
            modeloST2 = admin.getAtributo(admin.getCola2ST(), "nombre");
            simulation.getStCola2().setModel(modeloST2);
            
            // Cola ST 3
            DefaultListModel modeloST3 = new DefaultListModel();
            modeloST3 = admin.getAtributo(admin.getCola3ST(), "nombre");
            simulation.getStCola3().setModel(modeloST3);
            
            // Cola ST refuerzo
            DefaultListModel modeloSTrefuerzo = new DefaultListModel();
            modeloSW3 = admin.getAtributo(admin.getColaRST(), "nombre");
            simulation.getStColaRefuerzo().setModel(modeloSTrefuerzo);
            
            // Puntaje
            
        }
    }
    
    
    
    public SimulationView getSimulation() {
        return simulation;
    }

    public void setSimulation(SimulationView simulation) {
        this.simulation = simulation;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
    
    
    
}
