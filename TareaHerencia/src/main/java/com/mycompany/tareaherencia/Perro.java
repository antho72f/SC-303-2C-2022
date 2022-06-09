/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class Perro extends Animal {
    private String raza;
    private String pedigree;

    public Perro(String nombre, String tipoReino, String entorno, String alimentacion, String reproduccion, String especie, String tipoSangre, String raza, String pedigree) {
        super(nombre, tipoReino, entorno, alimentacion, reproduccion, especie, tipoSangre);
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nRaza: ").append(raza);
        sb.append("\nPedigree=").append(pedigree);
        return sb.toString();
    }
    
}
