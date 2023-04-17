/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.actividadbaraja;


/**
 * en esta clase define el comportamiento de una clase de una carta de una baraja 
 * 
 * 
 * @author Hector Duran
 */
public class carta {
    private String valor;
    private String simbolo;
    

    public carta(String valor, String simbolo) {
        this.valor = valor;
        this.simbolo = simbolo;
                
    }

    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return valor+" de "+simbolo;
    }

    
}
