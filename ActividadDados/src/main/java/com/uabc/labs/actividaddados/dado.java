/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.actividaddados;
import java.util.Random;
/**
 *
 * @author us
 */
public final class dado {
    private int cantidadLados= 6;
    private int ladoVisible;

    public dado() {
        getLadoVisible();
    }
    public int getLadoVisible(){
        Random rd = new Random();
        this.ladoVisible= rd.nextInt(cantidadLados+1);
        return ladoVisible;
    }

    @Override
    public String toString() {
        return "dado{" + "cantidadLados=" + cantidadLados + ", ladoVisible=" + ladoVisible + '}'+"\n";
    }
    
}
