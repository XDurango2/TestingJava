/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.practicax;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author us
 */
public class Numeros {
    private ArrayList <Integer> listaNumeros;
    private ArrayList <String> repeticiones;

    public Numeros() {
        setNumeros();
        showNumeros();
        getRepetidos();
        showRepetidos();
                
    }

    public void setNumeros() {
        Random rd = new Random();
        this.listaNumeros = new ArrayList <> ();
        for(int k=0;k<12;k++){
           int rint = rd.nextInt(11);
           listaNumeros.add(rint);    
        
        }    
        
    }
    public void showNumeros(){
        for(int k=0;k<listaNumeros.size();k++){
            int numeroX=listaNumeros.get(k);
            System.out.println(numeroX);
        }
    }
    public void getRepetidos(){
        this.repeticiones = new ArrayList <>();
        
            for(int k=0;k<listaNumeros.size();k++){
                int control1=listaNumeros.get(k);                
                int repetiones=0;
                for(int j=k+1;j<listaNumeros.size();j++){
                    int control2=listaNumeros.get(j);
                    if(control1==control2){
                       repetiones++;
                    }
                }
                if(repetiones>=1){
                String frase = "el numero:"+control1+" se repitio "+repetiones+" veces";
                repeticiones.add(frase);
                }
                
            }
        }
    public void showRepetidos(){
        for(int k=0;k<repeticiones.size();k++){
            String frase= repeticiones.get(k);
            System.out.println(frase);
        }
    }
    
}
