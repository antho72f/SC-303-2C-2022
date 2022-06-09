/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class Animal extends SerVivo {
    protected String especie;
    protected String tipoSangre;

    public Animal(String nombre, String tipoReino, String entorno, String alimentacion, String reproduccion,String especie, String tipoSangre) {
        super(nombre, tipoReino, entorno, alimentacion, reproduccion);
        this.especie = especie;
        this.tipoSangre = tipoSangre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nEspecie: ").append(especie);
        sb.append("\nSangre: ").append(tipoSangre);
        return sb.toString();
    }
    
}
