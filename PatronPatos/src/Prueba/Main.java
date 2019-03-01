/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;
import Patos.*;
/**
 *
 * @author carlosA
 */
public class Main {
    public static void main(String... args){
        Pato generico = new PatoPechoRojo();
        generico.getVolar();
        generico.getGraznar();

        generico = new PatoHule();
        generico.getVolar();
        generico.getGraznar();

        generico = new PatoMadera();
        generico.getVolar();
        generico.getGraznar();
}
    
}
