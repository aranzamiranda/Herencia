/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author chiky
 */
public class Perro extends Canino{
    private int numDientes;
    private String longevidad;
    private String raza;

    public Perro() {
        this.numDientes = 0;
        this.longevidad = "";
        this.raza = "";
    }

    public Perro(int numDientes, String longevidad, String raza, String audicion, String temperaturaCorporal, String vision, String nombre, String comida, String lugar, String tamano, String familia) {
        super(audicion, temperaturaCorporal, vision, nombre, comida, lugar, tamano, familia);
        this.numDientes = numDientes;
        this.longevidad = longevidad;
        this.raza = raza;
    }
    public void ladrar(){
        System.out.println("Guau guau");
    }
     @Override
    public String toString(){
        return "Numero de dientes:"+numDientes+"-"+"Raza:"+raza;
    }

    public int getNumDientes() {
        return this.numDientes;
    }

    public void setNumDientes(int numDientes) {
        this.numDientes = numDientes;
    }

    public String getLongevidad() {
        return this.longevidad;
    }

    public void setLongevidad(String longevidad) {
        this.longevidad = longevidad;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}
