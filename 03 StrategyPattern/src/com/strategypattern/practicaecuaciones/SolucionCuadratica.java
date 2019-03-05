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
public class SolucionCuadratica implements Solucion {

    @Override
    public double[] solucion(double[] coef) {
        // coef [0] = Ax^2
        // coef [1] = Bx
        // coef [2] = C

        double a = coef[0];
        double b = coef[1];
        double c = coef[2];

        double determinant = Math.pow(b, 2) - 4 * a * c;
        if (determinant > 0) {

            // System.out.println(
            //         "X [1]: " + ((-b+Math.sqrt(determinant))/(2*a)) 
            //   + " \n X [2]: " + ((-b-Math.sqrt(determinant))/(2*a))
            // );            
            return new double[]{(-b + Math.sqrt(determinant)) / (2 * a),
                (-b - Math.sqrt(determinant)) / (2 * a)};

        } else if (determinant == 0) {
            // System.out.println("X[1]: " + -b / (2 * a));
            return new double[]{-b / (2 * a), 0};

        } else {
            return new double[]{
                -b / (2 * a), Math.sqrt(-determinant) / (2 * a),
                -b / (2 * a), Math.sqrt(-determinant) / (2 * a)};
        }
        //return null;
    }

}
