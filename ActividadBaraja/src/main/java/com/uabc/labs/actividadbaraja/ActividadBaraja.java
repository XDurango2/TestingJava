/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uabc.labs.actividadbaraja;
import java.util.Scanner;
/**
 *
 * @author us
 */
public class ActividadBaraja {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean confirmContinue = true;
        baraja barajaCartas = new baraja();
        System.out.println("generando baraja, espere...");
        baraja baraja1 = new baraja();
        do{
        System.out.println("baraja generada!");
        System.out.println("barajando");
        barajaCartas.barajar();
        barajaCartas.mostrarCartaRandom();
        System.out.println("desea continuar(si/no)?");
        String confirm = sc.nextLine();         
        if(confirm.equalsIgnoreCase("si")){
            confirmContinue =true;

        }else if(confirm.equalsIgnoreCase("no")){
            confirmContinue = false;

        }
            
        }while(confirmContinue);
    }
}
