/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import primitives.Nodo;
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
            
            JList lista1 = new JList();
            DefaultListModel modelo = new DefaultListModel();
            
            Nodo headSW1 = admin.getCola1SW().getHead();
            String headSW1Name = headSW1.getElement().getNombre();
            modelo.addElement(headSW1);
            Nodo elemento = headSW1.getpNext();
            String elementoName = elemento.getElement().getNombre();
            modelo.addElement(elementoName);
            for(int i = 2; i<= admin.getCola1SW().getSize(); i++){
                elemento = elemento.getpNext();
                elementoName = elemento.getElement().getNombre();
                modelo.addElement(elementoName);
            }
            lista1.setModel(modelo);
            simulation.setSwCola1(lista1);
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
