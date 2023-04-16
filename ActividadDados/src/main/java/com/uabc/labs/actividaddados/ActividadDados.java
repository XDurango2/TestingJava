/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uabc.labs.actividaddados;
import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author us
 */
public class ActividadDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        boolean confirmContinue = true;
        HashSet<dado> DadosGuardados = new HashSet<>();
        do{
        System.out.println("ingrese la cantidad de dados a generar: ");
        int cantidadDados = sc.nextInt();
        if(cantidadDados>5||cantidadDados<1){
            System.out.println("error: cantidad invalida");
        }else{
        for(int k=0;k<cantidadDados;k++){
            dado Dado1 = new dado();
            DadosGuardados.add(Dado1);
        }
        System.out.println(DadosGuardados);
        }
            System.out.println("desea continuar?(si/no):");
             String confirm = scString.nextLine();
             if(confirm.equalsIgnoreCase("si")){
                 confirmContinue =true;
                 
             }else if(confirm.equalsIgnoreCase("no")){
                 confirmContinue = false;
                 
             }
    }while(confirmContinue=false);
        }
}

