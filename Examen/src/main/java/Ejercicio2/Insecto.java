/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author antho
 */
public class Insecto extends Animal implements DefinirAnimal {
    protected boolean vuela;

    public Insecto(String especie, String nombre, double peso, int jaula) {
        super(especie, nombre, peso, jaula);
    }

    @Override
    public String definirClaseDeAnimalEres() {
        return "";
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
}
