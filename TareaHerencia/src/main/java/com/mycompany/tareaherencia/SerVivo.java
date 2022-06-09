/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class SerVivo {
    protected String nombre;
    protected String tipoReino;
    protected String entorno;
    protected String alimentacion;
    protected String reproduccion;

    public SerVivo(String nombre, String tipoReino, String entorno, String alimentacion, String reproduccion) {
        this.nombre = nombre;
        this.tipoReino = tipoReino;
        this.entorno = entorno;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoReino() {
        return tipoReino;
    }

    public void setTipoReino(String tipoReino) {
        this.tipoReino = tipoReino;
    }
    
    public String getEntorno() {
        return entorno;
    }

    public void setEntorno(String entorno) {
        this.entorno = entorno;
    }
    
    public String getAlimentacion() {
        return alimentacion;
    }

    public void setNutriccion(String nutriccion) {
        this.alimentacion = nutriccion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Información");
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nReino: ").append(tipoReino);
        sb.append("\nEntorno: ").append(entorno);
        sb.append("\nAlimentación: ").append(alimentacion);
        sb.append("\nReproducción: ").append(reproduccion);
        return sb.toString();
    }
    
}
