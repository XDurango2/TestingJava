/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.actividadnumeroscomplejos;

/** en esta clase se define que es un numero complejo y aqui se realizan las operaciones con ellas
 *
 * @author Hector Duran
 */
public class numeroComplejo {
    private double numeroReal;
    private double numeroImaginario;

    public numeroComplejo(double numeroReal, double numeroImaginario) {
        this.numeroReal = numeroReal;
        this.numeroImaginario = numeroImaginario;
    }

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    public double getNumeroImaginario() {
        return numeroImaginario;
    }

    public void setNumeroImaginario(double numeroImaginario) {
        this.numeroImaginario = numeroImaginario;
    }

    @Override
    public String toString() {
        return numeroReal+"+"+numeroImaginario+"i";
    }
    public numeroComplejo suma(numeroComplejo numero2){ //aqui se realiza la suma de numeros complejos 
        double ResultadoReal= this.numeroReal+numero2.numeroReal;
        double ResultadoImaginario = this.numeroImaginario+ numero2.numeroImaginario;
        return new numeroComplejo(ResultadoReal,ResultadoImaginario);
    }
    public numeroComplejo resta(numeroComplejo numero2){ // aqui se realiza la resta de numeros complejos
        double ResultadoReal= this.numeroReal-numero2.numeroReal;
        double ResultadoImaginario= this.numeroImaginario-numero2.numeroImaginario;
        return new numeroComplejo(ResultadoReal,ResultadoImaginario);
        
    }
    public numeroComplejo multiplicar(numeroComplejo otro) { // aqui se realiza la multiplicacion de numeros complejos
        double realResultado = (this.numeroReal * otro.numeroReal) - (this.numeroImaginario * otro.numeroImaginario);
        double imaginarioResultado = (this.numeroReal * otro.numeroImaginario) + (this.numeroImaginario * otro.numeroReal);
        return new numeroComplejo(realResultado, imaginarioResultado);
    }

    public numeroComplejo dividir(numeroComplejo otro) { //aqui se realiza la division de numeros complejos
        double denominador = (otro.numeroReal * otro.numeroReal) + (otro.numeroImaginario * otro.numeroImaginario);
        double realResultado = ((this.numeroReal * otro.numeroReal) + (this.numeroImaginario * otro.numeroImaginario)) / denominador;
        double imaginarioResultado = ((this.numeroImaginario * otro.numeroReal) - (this.numeroReal * otro.numeroImaginario)) / denominador;
        return new numeroComplejo(realResultado, imaginarioResultado);
    }
}
