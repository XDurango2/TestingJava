/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uabc.labs.actividadnumeroscomplejos;
import java.util.Scanner;

/**
 *
 * @author us
 */
public class ActividadNumeroscomplejos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero complejo 1 ");
        String complejo1String  = sc.nextLine();
        numeroComplejo complejo1 = parsearnumeroComplejo(complejo1String);
        
        System.out.println("Ingrese el número complejo 2 (en formato a+bi): ");
        String complejo2String = sc.nextLine();
        numeroComplejo complejo2 = parsearnumeroComplejo(complejo2String);

        numeroComplejo resultado = complejo1.suma(complejo2);
        System.out.println("La suma es: " + resultado);

        resultado = complejo1.resta(complejo2);
        System.out.println("La resta es: " + resultado);

        resultado = complejo1.multiplicar(complejo2);
        System.out.println("La multiplicación es: " + resultado);

        resultado = complejo1.dividir(complejo2);
        System.out.println("La división es: " + resultado);
        
    }
    public static numeroComplejo parsearnumeroComplejo(String complejoString) {
    double real = 0;
    double imaginario = 0;

    int signoPositivoIndex = complejoString.indexOf("+");
    if (signoPositivoIndex != -1) {
        // Si el signo + está presente, el formato debe ser a+bi
        real = Double.parseDouble(complejoString.substring(0, signoPositivoIndex));
        imaginario = Double.parseDouble(complejoString.substring(signoPositivoIndex + 1, complejoString.length() - 1));
    } else {
        // De lo contrario, el formato debe ser a-bi
        int signoNegativoIndex = complejoString.indexOf("-");
        real = Double.parseDouble(complejoString.substring(0, signoNegativoIndex));
        imaginario = Double.parseDouble(complejoString.substring(signoNegativoIndex + 1, complejoString.length() - 1)) * -1;
    }

    return new numeroComplejo(real, imaginario);
}

}
