/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class Vegetal extends SerVivo {
    private String tipo;
    private String duracion;

    public Vegetal(String nombre, String tipoReino, String entorno, String alimentacion, String reproduccion, String tipo, String duracion) {
        super(nombre, tipoReino, entorno, alimentacion, reproduccion);
        this.tipo = tipo;
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nTipo: ").append(tipo);
        sb.append("\nDuracion: ").append(duracion);
        return sb.toString();
    }
    
}
