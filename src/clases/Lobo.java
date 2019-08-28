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
public class Lobo extends Canino{
    private int numDientes;
    private String organizacion;
    private String longevidad;

    public Lobo() {
        this.numDientes = 0;
        this.organizacion = "";
        this.longevidad = "";
    }

    public Lobo(int numDientes, String organizacion, String longevidad, String audicion, String temperaturaCorporal, String vision, String nombre, String comida, String lugar, String tamano, String familia) {
        super(audicion, temperaturaCorporal, vision, nombre, comida, lugar, tamano, familia);
        this.numDientes = numDientes;
        this.organizacion = organizacion;
        this.longevidad = longevidad;
    }
    public void aullar(){
        System.out.println("Auuuuuuuuuuu!");
    }
    @Override
    public String toString(){
        return "Numero de dientes:"+numDientes+"-"+"Organizacion:"+organizacion;
    }

    public int getNumDientes() {
        return this.numDientes;
    }

    public void setNumDientes(int numDientes) {
        this.numDientes = numDientes;
    }

    public String getOrganizacion() {
        return this.organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getLongevidad() {
        return this.longevidad;
    }

    public void setLongevidad(String longevidad) {
        this.longevidad = longevidad;
    }
    
    
    
}
