/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patos;
import Comportamiento.IVolar;
import Comportamiento.Graznar;
/**
 *
 * @author carlosA
 */
public abstract class Pato {
    private String nombre;
    private int edad;
    private IVolar vuela;
    private Graznar graznar;

    public abstract void getVolar();
    public abstract void getGraznar();
    

    public Pato(){
        this.nombre = "";
        this.edad = 0;
    }

    public Pato(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public IVolar getVuela() {
        return vuela;
    }

    public void setVuela(IVolar vuela) {
        this.vuela = vuela;
    }   
    
    public Graznar getGraznido(){
        return graznar;
    }

    public void setGraznido(Graznar graznar) {
        this.graznar = graznar;
    }   
}
