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
public class EcuacionCuadratica extends Ecuacion {

    public EcuacionCuadratica(double[] coeficientes) {
        super(coeficientes);
    }

    @Override
    public void mostrar() {
        double[] values = this.solucion.solucion(coeficientes);

        switch (values.length) {
            case 1:
                System.out.println("Raices:\n\t X ( 1 ) = " + values[0] + "\n\tX ( 2 )" + values[1]);
                break;
            case 2:
                System.out.println("Raices:\n\t X ( 1 ) = " + values[0]);
                break;
            case 4:
                System.out.println(
                        "X[1] :" + values[0] + " + i *  " + values[1] +
                      "\nX[2] :" + values[2] + " - i *  " + values[3]);
                break;

        }
    }

}
