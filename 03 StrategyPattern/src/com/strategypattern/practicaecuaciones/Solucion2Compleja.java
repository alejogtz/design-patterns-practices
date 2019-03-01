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
public class Solucion2Compleja implements Solucion {

    @Override
    public double[] solucion(double[] coef) {

        double a = coef[0];
        double b = coef[1];
        double c = coef[2];

        double determinant = Math.pow(b, 2) - 4 * a * c;

        //System.out.println("Roots are " + -b/(2*a) + "+i" +  Math.sqrt(-determinant)/(2*a) + " and "
        //                    + -b/(2*a) + "-i" + Math.sqrt(-determinant)/(2*a));
        
        // Formato de salida: 
        // {a, ai, b, bi}
        
        return new double[]{
            -b/(2*a), Math.sqrt(-determinant)/(2*a), 
            -b/(2*a),  Math.sqrt(-determinant)/(2*a)};

    }
    
    

}
