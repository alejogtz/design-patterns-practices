/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategypattern.practicapato.Patos;
import com.strategypattern.practicapato.Comportamiento.*;
/**
 *
 * @author carlosA
 */

public class PatoPechoRojo extends Pato{

    @Override
    public void getVolar() {
        IVolar vuela = getVuela();
        vuela = new VolarPlaneando();
        vuela.volar();
    }
    
    
    @Override
    public void getGraznar() {
        Graznar graznido = getGraznido();
        graznido = new MudoQuack();
        graznido.graznar();
    }

}