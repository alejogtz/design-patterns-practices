/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patos;
import Comportamiento.Graznar;
import Comportamiento.IVolar;
import Comportamiento.Chirrido;
import Comportamiento.NoVolar;
/**
 *
 * @author carlosA
 */
public class PatoHule extends Pato{

    @Override
    public void getVolar() {
        IVolar vuela = getVuela();
        vuela = new NoVolar();
        vuela.volar();
    }
    
     @Override
    public void getGraznar() {
        Graznar graznido = getGraznido();
        graznido = new Chirrido();
        graznido.graznar();
    }

}
