/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startrek.starwars;

/**
 *
 * @author rgabr
 */
public class Personaje {
    int id;
    String nombre;//probablemente txt 
    int agilidad;
    int habilidad;
    int fuerza;
    int vida;
    int prioridad;
    int contador;
    String Calidad; //maybe int
    Saga saga;//maybe

    public Personaje(int id, String nombre, Saga saga) {
        this.id = id;
        this.nombre = nombre;
        this.contador = 0;
        this.saga = saga;
    }
    
    public void DefinirStats(){
        /*
        Numeros random del 1 al 10
        Habilidad
        agilidad
        vida
        fuerza
        */
        this.habilidad=(int)(Math.random()*10+1);
        //System.out.println("Habilidad: "+this.getHabilidad() );
        this.agilidad=(int)(Math.random()*10+1);
        //System.out.println("Agilidad: "+this.getAgilidad() );
        this.fuerza=(int)(Math.random()*10+1);
        //System.out.println("Fuerza: "+this.getFuerza() );
        this.vida=(int)(Math.random()*10+1);
       // System.out.println("Vida: "+this.getVida());
        
    }
    
    public void DefinirCalidad(){
        /*
        En base a los stats probabilidad de ser de calidad
        Habilidad 60%
        Vida 70%
        Fuerza 50%
        Agilidad 40%
        deficiente <=1
        excepcional =4
        promedio 2 y 3
        */
        this.DefinirStats();
        int i =0;
        if (this.getHabilidad()>4){
            i++;
        }
        if (this.getAgilidad()>6){
            i++;
        }
        if (this.getFuerza()>5){
            i++;
        }
        if (this.getVida()>3){
            i++;
        }
        if (i<=1){
            this.setCalidad("Deficiente");
            this.setPrioridad(3);
        }else if(i==4){
            this.setCalidad("Excepcional");
            this.setPrioridad(1);
        }else{
            this.setCalidad("Promedio");
            this.setPrioridad(2);
        }
       /* System.out.println("I: "+ i);
        System.out.println("Calidad: "+this.getCalidad());
        System.out.println("Prioridad: "+this.getPrioridad());*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidades) {
        this.habilidad = habilidades;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    public Saga getSaga() {
        return saga;
    }

    public void setSaga(Saga saga) {
        this.saga = saga;
    }
    
   
}
