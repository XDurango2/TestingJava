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
        HashSet<dado> DadosGuardados = new HashSet<>();
        System.out.println("ingrese la cantidad de dados a generar: ");
        int cantidadDados = sc.nextInt();
        for(int k=0;k<cantidadDados;k++){
            dado Dado1 = new dado();
            DadosGuardados.add(Dado1);
        }
        System.out.println(DadosGuardados);
    }
}
