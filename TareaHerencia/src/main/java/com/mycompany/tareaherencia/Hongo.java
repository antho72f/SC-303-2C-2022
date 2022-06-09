/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class Hongo extends Fungi {
    private String clasificacion;
    private String comestible;

    public Hongo(String nombre, String tipoReino, String entorno, String alimentacion, String reproduccion, String forma, String funcion, String clasificacion, String comestible) {
        super(nombre, tipoReino, entorno, alimentacion, reproduccion, forma, funcion);
        this.clasificacion = clasificacion;
        this.comestible = comestible;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getComestible() {
        return comestible;
    }

    public void setComestible(String comestible) {
        this.comestible = comestible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nClasificacion: ").append(clasificacion);
        sb.append("\nComestible: ").append(comestible);
        return sb.toString();
    }
    
    
}
