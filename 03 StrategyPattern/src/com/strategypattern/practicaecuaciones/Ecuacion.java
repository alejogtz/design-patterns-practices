/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategypattern.practicaecuaciones;

/**
 *
 * @author Alessio
 */
public abstract class Ecuacion {
    
    protected Solucion solucion;
    
    protected double [] coeficientes;
    
    public Ecuacion(double [] coeficientes){
        this.coeficientes = coeficientes;
    }
    
    // void porque seguro se va a mostrar en un println
    public abstract void mostrar();
    
    public void setSolucionEstrategia(Solucion solucion){
        this.solucion = solucion;
    }
}
