/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startrek.starwars;

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
        Saga sw;
        sw= new Saga("Star Wars");
        Personaje pj;
        pj = new Personaje(1,"A",2,"B",sw);
        pj.DefinirCalidad();
    }
    
}
