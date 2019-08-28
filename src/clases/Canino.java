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
public class Canino extends Animal{
    
   private String audicion;
   private String temperaturaCorporal;
   private String vision;

    public Canino() {
        this.audicion = "";
        this.temperaturaCorporal = "";
        this.vision = "";
    }

    public Canino(String audicion, String temperaturaCorporal, String vision, String nombre, String comida, String lugar, String tamano, String familia) {
        super(nombre, comida, lugar, tamano, familia);
        this.audicion = audicion;
        this.temperaturaCorporal = temperaturaCorporal;
        this.vision = vision;
    }
    public void rugir(){
        System.out.println("Roaaaar");
    }
     @Override
     public String toString(){
        return "Audicion:"+audicion+"- "+"Temperatura corporal:"+temperaturaCorporal;
    }
    public String getAudicion() {
        return this.audicion;
    }

    public void setAudicion(String audicion) {
        this.audicion = audicion;
    }

    public String getTemperaturaCorporal() {
        return this.temperaturaCorporal;
    }

    public void setTemperaturaCorporal(String temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public String getVision() {
        return this.vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }
   
    
    
}
