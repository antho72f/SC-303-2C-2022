/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public abstract class SerVivo {
    protected String nombre;
    protected String tipoReino;
    protected String entorno;

    public SerVivo(String nombre, String tipoReino, String entorno) {
        this.nombre = nombre;
        this.tipoReino = tipoReino;
        this.entorno = entorno;
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
    
    public abstract String alimentarse(String a);
    
    public abstract String reproducirse(String r);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Información");
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nReino: ").append(tipoReino);
        sb.append("\nEntorno: ").append(entorno);
        return sb.toString();
    }
    
}
