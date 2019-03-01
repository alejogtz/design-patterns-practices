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
public class EcuacionLineal extends Ecuacion{

    public EcuacionLineal(double[] coeficientes) {
        super(coeficientes);        
    }

    @Override
    public void mostrar() {
        double [] values = this.solucion.solucion(coeficientes);
        
        for (int i = 0; i < values.length; i++){
            System.out.println("[X{"+ i +"}] : " + values[i]);
        }
    }
    
}
