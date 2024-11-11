/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import primitives.Cola;
//import primitives.Nodo;
import startrek.starwars.Administrador;
import startrek.starwars.IA;
import startrek.starwars.Saga;

/**
 *
 * @author Luriannys Junco
 */
public class Yes extends Thread{
    
    private SimulationView simulation;
    private Administrador admin;
    private IA ia;
    private Saga sw;
    private Saga st;
    
    public Yes(SimulationView simulation, Administrador admin, IA ia, Saga sw, Saga st) {
        this.simulation = simulation;
        this.admin = admin;
        this.ia = ia;
        this.sw = sw;
        this.st = st;
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
            
            // Estado IA
            simulation.getIaEstado().setText(ia.getResultado());
            
            // Puntaje
            simulation.getPuntajeSimulacion().setText(Integer.toString(sw.getPuntos()) + " - " + Integer.toString(st.getPuntos()));
            
            // Habilidades Star Wars
            if (ia.getPj1() != null){
                simulation.getHabilidadesSw().setText("<html>Nombre: " + ia.getPj1().getElement().getNombre() + "<br>ID: " + Integer.toString(ia.getPj1().getElement().getId()) + "<br>Agilidad: " + Integer.toString(ia.getPj1().getElement().getAgilidad()) + "<br>Habilidad: " + Integer.toString(ia.getPj1().getElement().getHabilidad()) + "<br>Fuerza: " + Integer.toString(ia.getPj1().getElement().getFuerza()) + "<br>Vida: " + Integer.toString(ia.getPj1().getElement().getVida())+ "</html>");  
                simulation.getPj1().setIcon(new ImageIcon(getClass().getResource(ia.getPj1().getElement().getImagen())));
            }
            // Habilidades Star Trek
            if (ia.getPj2() != null){
                simulation.getHabilidadesSt().setText("<html>Nombre: " + ia.getPj2().getElement().getNombre() + "<br>ID: " + Integer.toString(ia.getPj2().getElement().getId()) + "<br>Agilidad: " + Integer.toString(ia.getPj2().getElement().getAgilidad()) + "<br>Habilidad: " + Integer.toString(ia.getPj2().getElement().getHabilidad()) + "<br>Fuerza: " + Integer.toString(ia.getPj2().getElement().getFuerza()) + "<br>Vida: " + Integer.toString(ia.getPj2().getElement().getVida())+ "</html>");  
                simulation.getPj2().setIcon(new ImageIcon(getClass().getResource(ia.getPj2().getElement().getImagen())));
            }
            
            // Cambiar tiempo
            ia.setTiempo(Double.parseDouble((String) simulation.getTiempoSegundo().getSelectedItem()));
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
