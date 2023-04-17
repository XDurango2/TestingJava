/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uabc.labs.actividadnumeroscomplejos;
import java.util.Scanner;

/** en este programa se realiza una calculadora de numeros complejos que puede realizar operaciones basicas con ellas
 * como la suma, resta, multiplicacion y la division.
 *
 * @author Hector Duran
 */
public class ActividadNumeroscomplejos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero complejo 1 ");
        System.out.println("ingrese el numero real:");
        double Nreal1= sc.nextDouble();
        System.out.println("ingrese la parte imaginaria:");
        double Nimaginaria1 = sc.nextDouble();
        numeroComplejo complejo1 = new numeroComplejo(Nreal1,Nimaginaria1); 
        
        
        System.out.println("Ingrese el número complejo 2: ");
        System.out.println("ingrese la parte real:");
        double Nreal2= sc.nextDouble();
        System.out.println("ingrese la parte imaginaria:");
        double Nimaginaria2= sc.nextDouble();
        numeroComplejo complejo2 = new numeroComplejo(Nreal2,Nimaginaria2);
        System.out.println("numero complejo 1:"+complejo1);
        System.out.println("numero complejo 2:"+complejo2);

        numeroComplejo resultado = complejo1.suma(complejo2);
        System.out.println("La suma es: " + resultado);

        resultado = complejo1.resta(complejo2);
        System.out.println("La resta es: " + resultado);

        resultado = complejo1.multiplicar(complejo2);
        System.out.println("La multiplicación es: " + resultado);

        resultado = complejo1.dividir(complejo2);
        System.out.println("La división es: " + resultado);
        
    }
}
