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
public class Animal {
    private String nombre;
    private String comida; 
    private String sexo;
    private String lugar; 
    private String tamano;
    private String familia;
    
    public Animal(){
        this.nombre = "";
        this.comida = "";
        this.lugar = "";
        this.tamano = "";
        this.familia = "";
    }

    public Animal(String nombre, String comida, String lugar, String tamano, String familia) {
        this.nombre = nombre;
        this.comida = comida;
        this.lugar = lugar;
        this.tamano = tamano;
        this.familia = familia;
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    @Override
     public String toString(){
        return "Nombre:"+nombre+"- "+"Lugar:"+lugar;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComida() {
        return this.comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTamano() {
        return this.tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getFamilia() {
        return this.familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
    
}
