/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uabc.labs.actividadmoneda;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * en este programa se determinaran la cantidad de veces que una moneda da sello o aguila
 * en base a lo que determina el usuario
 * @author Hector Duran
 */
public class ActividadMoneda {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayList<String> HistorialMoneda = new ArrayList <>();
        moneda moneda1 = new moneda ();
        System.out.println("ingrese la cantidad de lanzamientos:");
        int cantidadLanzamientos= sc.nextInt();
        for(int k=0;k<cantidadLanzamientos;k++){
            HistorialMoneda.add(moneda1.getCaraVisible());
        }
        
        System.out.println(HistorialMoneda);
        
            
        
    }
}
