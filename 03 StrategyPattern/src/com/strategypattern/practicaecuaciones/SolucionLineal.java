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
public class SolucionLineal implements Solucion{


    @Override
    public double[] solucion(double[] coef) {
        double n = 0.0;
        if (coef != null)
            for (int i = 0; i < coef.length; i++){
                n = n + coef[i];
            }
        return new double[] {n, 0,0};
    }
    
}
