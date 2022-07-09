/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author antho
 */
public class Mamifero extends Animal implements DefinirAnimal{

    public Mamifero(String especie, String nombre, double peso, int jaula) {
        super(especie, nombre, peso, jaula);
    }

    @Override
    public String definirClaseDeAnimalEres() {
        return "";
    }
    
}
