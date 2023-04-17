/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.actividadbaraja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 *  en esta clase se define el comportamiento de una baraja de cartas,
 *  crea las cartas con la clase carta y las guardan en un arraylist
 * @author Hector Duran
 */
public class baraja {
    ArrayList <carta> barajaCartas ;

    public baraja() {
        this.barajaCartas = new ArrayList<>();
        String[] valores= {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] simbolos= {"corazones","Picas","diamantes","Treboles"};
        
        for (int k=0;k<valores.length;k++) {
            for (int j=0;j<simbolos.length;j++) {
               carta carta1 = new carta(valores[k],simbolos[j]);
                barajaCartas.add(carta1);
            }
        }
    }
    public void barajar(){
        Collections.shuffle(barajaCartas);
    }
    public void mostrarCartaRandom(){
        Random rd = new Random();
        int card = rd.nextInt(barajaCartas.size());
        carta cartaX = barajaCartas.get(card);
        System.out.println("tu carta es "+cartaX);
        barajaCartas.remove(card);
    }
}
