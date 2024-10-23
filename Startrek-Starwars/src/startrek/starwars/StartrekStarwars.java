/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startrek.starwars;

import interfaces.PrincipalView;

/**
 *
 * @author rgabr
 */
public class StartrekStarwars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrincipalView main = new PrincipalView();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        
        
        IA ia;
        
        Saga sw, st;
        sw= new Saga("Star Wars");
        st = new Saga("Star Trek");
        Personaje pj, pjs;
        pj = new Personaje(1,"A",sw);
        pj.DefinirCalidad();
        pjs = new Personaje(2, "B", st);
        pjs.DefinirCalidad();
        
        ia = new IA(pj, pjs);
        ia.startIA();
       
    }
    
}
