/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.actividadmoneda;
import java.util.Random;
/**
 *  en esta clase se determina el comportamiento de una moneda y muestra la cara visible en base a un objeto random
 * @author Hector Duran
 */
public class moneda {
    boolean estaVolteado=false;

    public moneda() {
        getCaraVisible();
    }
    public String getCaraVisible(){
        
        Random rd = new Random();
        this.estaVolteado = rd.nextBoolean();
        if(estaVolteado){
            return "esta moneda esta en aguila \n";
        }else{
        return "moneda esta en sello \n";
    }
    }

    @Override
    public String toString() {
        if(estaVolteado){
            return "esta moneda esta en aguila";
        }else{
        return "moneda esta en sello";
    }
    }
    
    
}
