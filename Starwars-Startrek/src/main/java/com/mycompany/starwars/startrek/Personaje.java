/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starwars.startrek;

/**
 *
 * @author rgabr
 */
public class Personaje {
    int id;
    String nombre;
    int agilidad;
    int habilidades;
    int fuerza;
    int vida;
    int prioridad;
    int contador;
    String Calidad; //maybe int
    Saga saga;//maybe

    public Personaje(int id, String nombre, int agilidad, int habilidades, int fuerza, int vida, int prioridad, int contador, String Calidad, Saga saga) {
        this.id = id;
        this.nombre = nombre;
        this.agilidad = agilidad;
        this.habilidades = habilidades;
        this.fuerza = fuerza;
        this.vida = vida;
        this.prioridad = prioridad;
        this.contador = contador;
        this.Calidad = Calidad;
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

    public int getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(int habilidades) {
        this.habilidades = habilidades;
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
