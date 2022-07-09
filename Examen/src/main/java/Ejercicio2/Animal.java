/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author antho
 */
public abstract class Animal {
    protected String especie;
    protected String nombre;
    protected double peso;
    protected int jaula;

    public Animal(String especie, String nombre, double peso, int jaula) {
        this.especie = especie;
        this.nombre = nombre;
        this.peso = peso;
        this.jaula = jaula;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getJaula() {
        return jaula;
    }

    public void setJaula(int jaula) {
        this.jaula = jaula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEspecie: ").append(especie);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nPeso: ").append(peso);
        sb.append("\nNumero de jaula: ").append(jaula);
        return sb.toString();
    }
    
}
