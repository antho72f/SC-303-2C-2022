/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class Humano extends Animal {
    private String genero;
    private int edad;
    private String etnia;
    private String estatura;

    public Humano(String nombre, String tipoReino, String entorno, String alimentacion, String reproduccion, String especie, String tipoSangre, String genero, int edad, String etnia, String estatura) {
        super(nombre, tipoReino, entorno, alimentacion, reproduccion, especie, tipoSangre);
        this.genero = genero;
        this.edad = edad;
        this.etnia = etnia;
        this.estatura = estatura;
    }
    
    public void informacion(){
        
    }

    public void saludar(){
        System.out.println("Hola, soy "+this.getNombre()+". Mucho gusto\n-------------------------");
    }
    
    public void detalles(){
        System.out.println("Datos Básicos");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Género: "+this.getGenero());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Etnia: "+this.getEtnia());
        System.out.println("Estatura: "+this.getEstatura());
        
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------------------\n");
        sb.append(super.toString());
        sb.append("\nGénero: ").append(genero);
        sb.append("\nEdad: ").append(edad);
        sb.append("\nEtnia: ").append(etnia);
        sb.append("\nEstatura: ").append(estatura);
        sb.append("\n---------------------\n");
        return sb.toString();
    }
    
}
