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
        // Ecuacion de la forma Ax + B
        
        // So, coef[0] corresponde a A
        // and coef[1] corresponde a B
        // Se resulve que x = B/A si B no es trivial
        
        double a = coef[0];
        double b = coef[1];
        
        double raiz = 0.0;
        
        if (b != 0) raiz = -b/a;
        else raiz = 0;
        
        return new double[] {raiz};
    }
    
    
    
}

