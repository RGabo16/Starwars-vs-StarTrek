/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import javax.swing.DefaultListModel;
import javax.swing.JList;
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
            JList listaSW1 = new JList();
            DefaultListModel modeloSW1 = new DefaultListModel();
            modeloSW1 = admin.getAtributo(admin.getCola1SW(), "nombre");
            listaSW1.setModel(modeloSW1);
            simulation.setSwCola1(listaSW1);
            
            // Cola SW 2
            JList listaSW2 = new JList();
            DefaultListModel modeloSW2 = new DefaultListModel();
            modeloSW2 = admin.getAtributo(admin.getCola2SW(), "nombre");
            listaSW2.setModel(modeloSW2);
            simulation.setSwCola1(listaSW2);
            
            // Cola SW 3
            JList listaSW3 = new JList();
            DefaultListModel modeloSW3 = new DefaultListModel();
            modeloSW3 = admin.getAtributo(admin.getCola3SW(), "nombre");
            listaSW3.setModel(modeloSW3);
            simulation.setSwCola3(listaSW3);
            
            // Cola ST 1
            JList listaST1 = new JList();
            DefaultListModel modeloST1 = new DefaultListModel();
            modeloST1 = admin.getAtributo(admin.getCola1ST(), "nombre");
            listaST1.setModel(modeloST1);
            simulation.setSwCola1(listaST1);
            
            // Cola ST 2
            JList listaST2 = new JList();
            DefaultListModel modeloST2 = new DefaultListModel();
            modeloST2 = admin.getAtributo(admin.getCola2ST(), "nombre");
            listaST2.setModel(modeloST2);
            simulation.setSwCola1(listaST2);
            
            // Cola ST 3
            JList listaST3 = new JList();
            DefaultListModel modeloST3 = new DefaultListModel();
            modeloST3 = admin.getAtributo(admin.getCola3ST(), "nombre");
            listaST3.setModel(modeloST3);
            simulation.setSwCola3(listaST3);
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
