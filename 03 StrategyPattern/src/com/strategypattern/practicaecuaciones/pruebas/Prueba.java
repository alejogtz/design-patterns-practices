/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategypattern.practicaecuaciones.pruebas;

import com.strategypattern.practicaecuaciones.*;

/**
 *
 * @author Alessio
 */
public class Prueba {
    
    
    public static void main (String [] args){
        // Cliente
        
        // Ejemplo 1
        Ecuacion ecuacion = new EcuacionLineal(new double[] {1,-10});        
        Solucion solucion = new SolucionLineal();
        
        ecuacion.setSolucionEstrategia(solucion);        
        ecuacion.mostrar();
        
        // Ejemplo 2
        Ecuacion ec2 = new EcuacionCuadratica(new double []{1,2,3});        
        Solucion s2 = new SolucionCuadratica();
        
        ec2.setSolucionEstrategia(s2);        
        ec2.mostrar();
        
        //s2.solucion(new double []{1,2,3});
        
    }
            
            
}
