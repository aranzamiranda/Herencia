/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import clases.Animal;
import clases.Canino;
import clases.Lobo;
import clases.Perro;
/**
 *
 * @author chiky
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro firulais = new Perro();
        Perro firulais2 = new Perro(34, "Mas de 10 años", "Pastor aleman", "Buena", "39 grados", "Buena", "Perro", "Croquetas y carne", "En todas partes del mundo","Grande", "Mamifero");
        firulais2.setAudicion("Mala");
        firulais2.setComida("Vegetariano");
        firulais2.setFamilia("Canino");
        Lobo lobo = new Lobo();
        Lobo lobo2 = new Lobo(40, "Manada", "Mas de 10 años", "Buena", "40 grados", "Buena", "Lobo", "Carne", "Bosques y lugares frios", "Grande", "Mamifero");
        Canino canino1 = new Canino("Buena", "Entre 38 y 40 grados", "Buena", "Lobos, coyotes y perros", "Carne", "Todas partes", "Grandes", "Mamiferos");
        Animal animal1 = new Animal("Gato", "Carne", "Todas partes", "Pequeño", "Mamíferos");
    }
    
}
