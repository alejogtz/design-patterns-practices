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
        Ecuacion ecuacion = new EcuacionLineal(new double[] {1,2,3,4,5});
        Solucion solucion = new SolucionLineal();
        ecuacion.setSolucionEstrategia(solucion);
        
        ecuacion.mostrar();
    }
            
            
}
