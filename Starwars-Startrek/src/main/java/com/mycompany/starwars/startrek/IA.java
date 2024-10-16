/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starwars.startrek;

/**
 *
 * @author rgabr
 */
public class IA {
    Personaje pj1;
    Personaje pj2;
    String resultado;
    Lista lista;

    public IA(Personaje pj1, Personaje pj2, String resultado, Lista lista) {
        this.pj1 = pj1;
        this.pj2 = pj2;
        this.resultado = resultado;
        this.lista = lista;
    }

    public void DecidirGanador(){
        
    }
    public Personaje getPj1() {
        return pj1;
    }

    public void setPj1(Personaje pj1) {
        this.pj1 = pj1;
    }

    public Personaje getPj2() {
        return pj2;
    }

    public void setPj2(Personaje pj2) {
        this.pj2 = pj2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }
    
    
}
