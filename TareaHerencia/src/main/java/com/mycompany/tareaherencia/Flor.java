/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class Flor extends Vegetal{
    private String color;
    private String formaPetalo;
    private String tamaño;

    public Flor(String nombre, String tipoReino, String entorno, String alimentacion, String reproduccion, String tipo, String duracion, String color, String formaPetalo, String tamaño) {
        super(nombre, tipoReino, entorno, alimentacion, reproduccion, tipo, duracion);
        this.color = color;
        this.formaPetalo = formaPetalo;
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFormaPetalo() {
        return formaPetalo;
    }

    public void setFormaPetalo(String formaPetalo) {
        this.formaPetalo = formaPetalo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nColor: ").append(color);
        sb.append("\nForma de Petalo: ").append(formaPetalo);
        sb.append("\nTamaño: ").append(tamaño);
        return sb.toString();
    }
    
}
